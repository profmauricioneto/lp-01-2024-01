// crie um novo array com valores em fahrenheit
// (C × 9/5) + 32

const celsius = [-15, -5, 0, 10, 16, 20, 24, 32, 40];

function convertToFahrenheit(celsius) {
    let fahrenheit = celsius*(9/5) + 32;
    return fahrenheit;
}

let fahrenheitTemp = celsius.map(convertToFahrenheit);
console.log("Fahrenheit: " + fahrenheitTemp);
console.log("Celsius: " + celsius);