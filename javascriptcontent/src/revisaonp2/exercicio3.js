/**
 * Fa¸ca um programa usando a linguagem JavaScript que cria uma fun¸c˜ao que receba dois valores e diga
qual os valores pares entre esses dois n´umeros.
*/

const prompt = require('prompt-sync')();

function paresEntreValores(valor1, valor2) {
    for (let i = valor1; i <= valor2; i++) {
        if (i % 2 === 0) {
            console.log(i);
        }
    }
}

let valor1 = parseInt(prompt('Digite o primeiro valor: '));
let valor2 = parseInt(prompt('Digite o segundo valor: '));

paresEntreValores(valor1, valor2);