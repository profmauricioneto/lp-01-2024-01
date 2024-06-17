const express = require('express');
const users = require('./users');

const port = 3000;
const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

//show all
app.get('/users', (req, res, _) => {
    users.showUsers()
        .then(users => res.send(users))
        .catch(err => {
            console.error(err);
            res.status(500).send('An error occurred');
        });
});

// show by id
app.get('/users/:id', (req, res, _) => {
    users.findUser(parseInt(req.params.id))
        .then(user => {
            if (user) {
                res.send(user);
            } else {
                res.send('User not found.');
            }
        })
        .catch(err => {
            console.error(err);
            res.status(500).send('An error occurred');
        });
});
// create
app.post('/users', (req, res, _) => {
    users.addUser(req.body.name, parseInt(req.body.age), req.body.job)
        .then(newUser => res.send(newUser))
        .catch(err => {
            console.error(err);
            res.status(500).send('An error occurred');
        });
});
// delete
app.delete('/users/:id', (req, res, _) => {
    users.removeUser(parseInt(req.params.id))
        .then(removed => {
            if (removed) {
                res.send('User removed with success!');
            } else {
                res.send('User not found.');
            }
        })
        .catch(err => {
            console.error(err);
            res.status(500).send('An error occurred');
        });
});
// update
app.put('/users/:id', (req, res, _) => {
    users.update(parseInt(req.params.id), req.body.name, parseInt(req.body.age), req.body.job)
        .then(updated => {
            if (updated) {
                res.send('User updated with success!');
            } else {
                res.send('User not found.');
            }
        })
        .catch(err => {
            console.error(err);
            res.status(500).send('An error occurred');
        });
});

// server.js
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});