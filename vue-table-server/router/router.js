var router = require("express").Router()
var Todo = require('../models/todos')
var officegen = require('officegen')
var fs = require('fs')

const status = ['未开始', '进行中', '搁置', '完成']

router.route('/').get((req, res) => {
    Todo.find((err, todos) => {
        if (err) {
            console.log(err)
        }
        res.json(todos)
    })
}).post((req, res) => {
    var todo = req.body
    todo.status = 0
    Todo.create(todo, (err, todo) => {
        if (err) {
            console.log(err)
        }
        res.json(todo)
    })
})

router.route('/:id').put((req, res) => {
    Todo.findByIdAndUpdate(req.params.id, {$set:req.body}, {new: true}, (err, todo) => {
        if (err) console.log(err)
        res.json(todo)
    })
}).delete((req, res) => {
    Todo.findByIdAndRemove(req.params.id, (err, todo) => {
        if (err) console.log(err)
        res.json(todo)
    })
})

router.route('/download').post((req, res) => {
    var todos = req.body
    var data = []
    var heads = ['学习书籍', '作者', '学习计划状态', '学习完成时间']

    data.push(heads)
    todos.forEach((todo) => {
        var tmp = []
        tmp[0] = todo.name
        tmp[1] = todo.author.join(',')
        tmp[2] = status[todo.status]
        tmp[3] = new Date(todo.completeDate).toLocaleDateString()
        data.push(tmp)
    })

    var xlsx = officegen('xlsx')
    var sheet = xlsx.makeNewSheet()
    sheet.data = data

    xlsx.generate(res)
    // 如果将文件导出到服务器本地则采用以下代码
    // xlsx.generate(fs.createWriteStream('out.xlsx'))
})

module.exports = router
