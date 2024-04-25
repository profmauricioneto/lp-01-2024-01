/**
 * Faça um programa em JavaScript que receba uma frase do
usuário e coloque em letras maiúsculas.
○ 1. Dica: use a biblioteca prompt-sync do nodejs
(https://www.npmjs.com/package/prompt-sync).
○ 2. Dica: para usarmos as bibliotecas do node precisamos iniciar
o projeto com npm init -y (no terminal)
○ 3. Dica: após criar o package.json, digite no terminal npm install
prompt-sync
*/

var prompt = require('prompt-sync')();

let message = prompt("Escreva a mensagem: ");

console.log(message.toUpperCase());