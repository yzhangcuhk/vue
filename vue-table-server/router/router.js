var router = require("express").Router()
var Todo = require('../models/todos')

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

module.exports = router
