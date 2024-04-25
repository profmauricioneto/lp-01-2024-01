/**
 * Faça um programa usando a linguagem JavaScript que cria
uma função que receba dois valores e diga qual os valores
pares entre esses dois números
*/


function evenValues(initial, end) {
    for(let i = initial; i <= end; i++) {
        if (i % 2 == 0) {
            console.log(`O valor ${i} é par!`);
        }
    }
}

evenValues(10, 1);