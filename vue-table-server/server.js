var express = require('express')
var app = express()
var mongoose = require('mongoose')
var url = 'mongodb://127.0.0.1:27017/test'

bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

app.all('*', function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*")
    res.header("Access-Control-Allow-Headers", "X-Requested-With,Content-Type")
    res.header("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS")
    next()
})

app.use('/todos', require('./router/router'))

mongoose.connect(url, (err) => {
    if (err) {
        console.log(err)
    } else {
        console.log("db connect success")
    }
})

app.listen(3000, () => {
    console.log('server start')
})
