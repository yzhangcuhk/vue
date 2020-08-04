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

module.exports = router
