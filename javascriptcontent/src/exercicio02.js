var prompt = require('prompt-sync')();

let value = parseInt(prompt("Digite um valor: "));

if (value % 2 === 0) {
    console.log(`O valor ${value} é par.`);
} else {
    console.log(`O valor ${value} é ímpar.`);
}