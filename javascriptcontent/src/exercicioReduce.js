/**
 * Você tem um array de números inteiros. Sua tarefa é criar uma
função em JavaScript chamada encontrarMaiorValor que
utiliza o método reduce() para encontrar o maior valor no array
*/

function encontrarMaiorValor(array) {
    return array.reduce((acc, value) => acc > value ? acc : value);
}

let myArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(encontrarMaiorValor(myArray));