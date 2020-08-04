var mongoose = require('mongoose')

var todos = new mongoose.Schema({
    name: String,
    author: Array,
    content: String,
    status: Number,
    completeDate: Date
})

module.exports = mongoose.model('Todos', todos)
