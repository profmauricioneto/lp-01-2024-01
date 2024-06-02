const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');

const app = express();
const port = 3000;

app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname, 'public')));

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'public/views', 'index.html'));
});

app.post('/calcular', (req, res) => {
    const precoUnitario = parseFloat(req.body.precoUnitario);
    const quantidade = parseInt(req.body.quantidade);
    const desconto = parseFloat(req.body.desconto);

    const precoTotal = (precoUnitario * quantidade) - (precoUnitario * quantidade * desconto / 100);


    res.send(`
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Resultado</title>
        </head>
        
        <body>
            <h1>Resultado</h1>
            <p>Preço Unitário: R$ ${precoUnitario}</p>
            <p>Quantidade: ${quantidade}</p>
            <p>Desconto: ${desconto}%</p>
            <p>Preço Total: R$ ${precoTotal}</p>
        </body>

        </html>
    `);
});

app.listen(port, () => {
    console.log(`Server running on port ${port}`);
});
