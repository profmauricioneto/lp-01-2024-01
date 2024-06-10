var users = [
    { _id: 1, name: 'João' },
    { _id: 2, name: 'Maria' },
    { _id: 3, name: 'Pedro' },
    { _id: 4, name: 'Ana' },
];

function addUser(name) {
    const id = users.length + 1;
    let newUser = { _id: id, name };
    users.push(newUser);
    return newUser;
}

function findUser(id) {
    return users.find(user => user._id === id);
}

function showUsers() {
    return users;
}

module.exports = {
    users,
    addUser,
    findUser,
    showUsers
}