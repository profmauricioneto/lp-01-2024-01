const prompt = require('prompt-sync')();

let nome = prompt('Qual o seu nome: ');
let idade = parseInt(prompt('Qual a sua idade: '));

console.log(`Olá Sr(a). ${nome} você tem ${idade}`);