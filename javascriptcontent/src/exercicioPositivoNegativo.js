/**
 * Faça um programa em JS que verifique o sinal de um valor
recebido. Por exemplo: 4 -5 -3 6
○ Saída:
■ 4: sinal +
■ -5: sinal -
■ -3: sinal -
■ 6: sinal +
● O dado por ser recebido pelo terminal ou dado por um vetor
*/

var prompt = require('prompt-sync')();

let value = parseInt(prompt("Digite um valor: "));

let message = (value < 0) ? `${value}: sinal -` : `${value}: sinal +`;
console.log(message); 


let values = [1, -3, 4, -6, -7, 8];

for(let i = 0; i < values.length; i++) {
    let message = (values[i] < 0) ? `${values[i]}: sinal -` : `${values[i]}: sinal +`;
    console.log(message); 
}