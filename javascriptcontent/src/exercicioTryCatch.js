function calculadora(num1, num2, operation) {
    if (typeof num1 !== 'number' || typeof num2 !== 'number') {
        throw new Error('Os valores precisam ser números')
    }

    switch(operation) {
        case '+':
            return num1 + num2;
            break;
        case '-':
            return num1 - num2;
            break;
        case '*':
            return num1 * num2;
            break;
        case '/':
            if (num2 === 0) {
                throw new Error('Não é possível dividir por zero')
            } else {
                return num1 / num2;
            }
            break;
        default:
            throw new Error('Nenhuma operação valida foi passada!');
    }
}

try {
    let myresult = calculadora(10, 1, '+');
    console.log(myresult);
} catch(error) {
    console.error(error);
}