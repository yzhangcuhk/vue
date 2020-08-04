var router = require("express").Router()
var Todo = require('../models/todos')

router.route('/').get((req, res) => {
    Todo.find((err, todos) => {
        if (err) {
            console.log(err)
        }
        res.json(todos)
    })
})

module.exports = router
