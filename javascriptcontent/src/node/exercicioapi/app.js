const express = require('express');
// const bodyParser = require('body-parser');
const users = require('./users');

const port = 3000;
const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.get('/users', (req, res, next) => {
    res.send(users.showUsers());
});


app.get('/users/:id', (req, res, next) => {
    const { id } = req.params;
    const user = users.findUser(parseInt(id));
    res.send(user);
});

app.post('/users', (req, res, next) => {
    console.log(req.body);
    const { name } = req.body;
    console.log(name);
    const newUser = users.addUser(name);
    console.log(newUser);
    res.send(newUser);
});

// server.js
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});