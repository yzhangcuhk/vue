var express = require('express')
var app = new express();
var router = require('./router/users')

bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

var url = 'mongodb://127.0.0.1:27017/test'
var mongoose = require('mongoose')
mongoose.connect(url, (err) => {
    if (err) {
        console.log(err)
    } else {
        console.log('mongodb connect success')
    }
})

app.all('*', function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "X-Requested-With,Content-Type");
    res.header("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");
    next();
});

app.use('/users',router) // 将路由注册到/users的路径下

var port = process.env.PORT || 3000

app.listen(port)
console.log('app is listening on port:' + port)
