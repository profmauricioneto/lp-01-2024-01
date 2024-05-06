let prompt = require('prompt-sync')();
var user = {};

user.name = prompt('Digite seu nome: ');
user.age = parseInt(prompt('Digite sua idade: '));
user.isAdult = (user.age >= 18) ? true : false;

for (att in user) {
    console.log(`${att} = ${user[att]}`);
}

console.log(user);