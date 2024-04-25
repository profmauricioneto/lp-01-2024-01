{
    let nome = "mauricio";
    console.log(nome);
}

console.log("Hello world!");

for (var i= 0; i < 10; i++) {
    console.log(i);
}

console.log("Ultimo valor de i = " + i);

console.log(parseFloat("123") + 0.5);

var nota = 123.44;

console.log(nota.toFixed(4));

var nameUser = "fulano!";
console.log(`Ei ${nameUser}
tu ta acordado?
Isso cai em prova hein!
`);

var message = nameUser.concat(", Hello World.")
console.log(message);
console.log(message.replace("Hello", "Hi"));

let phrase = "O rato roeu a roupa do rei de roma";
let arrayPhrase = phrase.split(" ");
console.log(arrayPhrase);
console.log(arrayPhrase[1]);

console.log(4 + 3 + "5");