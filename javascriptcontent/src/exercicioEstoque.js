const prompt = require('prompt-sync')();

let estoque = [];

function cadastrarProduto() {
    let produto = {};
    produto.nome = prompt('Digite o nome do produto: ');
    produto.preco = parseFloat(prompt('Digite o preço do produto: '));
    produto.quantidade = parseInt(prompt('Digite a quantidade do produto: '));
    console.log("Produto cadastrado com sucesso.");
    estoque.push(produto);
}

function verificarEstoque(nome) {
    let flag = false;
    for (let i = 0; i < estoque.length; i++) {
        if (estoque[i].nome === nome) {
            console.log('Produto encontrado!');
            console.log(`Produto disponivel: ${estoque[i].nome}, Preço: R$${estoque[i].preco}, Quantidade: ${estoque[i].quantidade}`);
            flag = true;
            break;
        }
    }
    if (!flag) {
        console.log('Produto não disponivel no estoque!');
    }
}

function main() {
    let option = prompt('Deseja cadastrar um produto? (s/n) ');
    while (option === 's') {
        cadastrarProduto();
        option = prompt('Deseja cadastrar um produto? (s/n) ');
    }
    console.log(estoque);
    let nome = prompt('Digite o nome do produto: ');
    verificarEstoque(nome);
}

main();