var mongoose = require('mongoose')

var userSchema = new mongoose.Schema({
    name: String,
    pass: String,
    nickname: String
})

module.exports = mongoose.model('User', userSchema)
