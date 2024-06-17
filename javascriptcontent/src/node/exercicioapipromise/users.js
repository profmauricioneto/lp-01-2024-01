const fs = require('fs');

function addUser(name, age, job) {
    return new Promise((resolve, reject) => {
        fs.readFile('users.json', 'utf8', (err, data) => {
            if (err) {
                reject(err);
                return;
            }
            const users = JSON.parse(data);
            const id = users["users"].length + 1;
            let newUser = { _id: id, name: name , age: age, job: job};
            console.log(newUser);
            users["users"].push(newUser);
            fs.writeFile('users.json', JSON.stringify(users), (err) => {
                if (err) {
                    reject(err);
                    return;
                }
                resolve(newUser);
            });
        });
    });
}

function findUser(id) {
    return new Promise((resolve, reject) => {
        fs.readFile('users.json', 'utf8', (err, data) => {
            if (err) {
                reject(err);
                return;
            }
            const users = JSON.parse(data);
            const newLocal = users["users"].find(user => user._id == id);
            const user = newLocal;
            resolve(user);
        });
    });
}

function showUsers() {
    return new Promise((resolve, reject) => {
        fs.readFile('users.json', 'utf8', (err, data) => {
            if (err) {
                reject(err);
                return;
            }
            const users = JSON.parse(data);
            resolve(users);
        });
    });
}

function removeUser(id) {
    return new Promise((resolve, reject) => {
        fs.readFile('users.json', 'utf8', (err, data) => {
            if (err) {
                reject(err);
                return;
            }
            const users = JSON.parse(data);
            const index = users["users"].findIndex(user => user._id === id);
            if (index === -1) {
                resolve(false);
                return;
            }
            users["users"].splice(index, 1);
            fs.writeFile('users.json', JSON.stringify(users), (err) => {
                if (err) {
                    reject(err);
                    return;
                }
                resolve(true);
            });
        });
    });
}

function update(id, name, age, job) {
    return new Promise((resolve, reject) => {
        fs.readFile('users.json', 'utf8', (err, data) => {
            if (err) {
                reject(err);
                return;
            }
            const users = JSON.parse(data);
            const index = users["users"].findIndex(user => user._id == id);
            if (index == -1) {
                resolve(false);
                return;
            }
            users["users"][index].name = name;
            users["users"][index].age = age;
            users["users"][index].job = job;
            fs.writeFile('users.json', JSON.stringify(users), (err) => {
                if (err) {
                    reject(err);
                    return;
                }
                resolve(true);
            });
        });
    });
}

module.exports = {
    addUser,
    findUser,
    showUsers,
    removeUser,
    update,
}