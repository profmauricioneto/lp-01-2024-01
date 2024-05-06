let values = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function isEven(value) {
    return value % 2 === 0;
}

let evenValues = values.filter(isEven);
console.log("New Values = " + evenValues);
console.log("values: " + values);