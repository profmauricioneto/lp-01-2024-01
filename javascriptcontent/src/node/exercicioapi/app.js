const express = require('express');
// const bodyParser = require('body-parser');
const users = require('./users');

const port = 3000;
const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

//show all
app.get('/users', (req, res, next) => {
    res.send(users.showUsers());
});

// show by id
app.get('/users/:id', (req, res, next) => {
    const { id } = req.params;
    const user = users.findUser(parseInt(id));
    res.send(user);
});
// create
app.post('/users', (req, res, next) => {
    console.log(req.body);
    const { name } = req.body;
    console.log(name);
    const newUser = users.addUser(name);
    console.log(newUser);
    res.send(newUser);
});
// delete
app.delete('/users/:id', (req, res, next) => {
    const { id } = req.params;
    const removed = users.removeUser(parseInt(id));
    if (removed) {
        res.send('User removed with success!');
    } else {
        res.send('User not found.');
    }
});
// update
app.put('/users/:id', (req, res, next) => {
    const { id } = req.params;
    const { name } = req.body;
    const updated = users.update(parseInt(id), name);
    if (updated) {
        res.send('User updated with success!');
    } else {
        res.send('User not found.');
    }
});

// server.js
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});