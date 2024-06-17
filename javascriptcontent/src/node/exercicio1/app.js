const express = require("express");
const bodyParser = require("body-parser");
const path = require("path");

const app = express();

// Configura o body-parser para processar dados do formulário
app.use(bodyParser.urlencoded({ extended: true }));

// Servir arquivos estáticos da pasta 'public'
app.use(express.static(path.join(__dirname, "public")));

// Rota para processar o formulário
app.post("/calculate", (req, res) => {
  //   const num1 = parseFloat(req.body.num1);
  //   const num2 = parseFloat(req.body.num2);
  //   const num3 = parseFloat(req.body.num3);
  //   const num4 = parseFloat(req.body.num4);
  const { num1, num2, num3, num4 } = req.body;
  console.log(typeof(num1));
  const media = (parseFloat(num1) + parseFloat(num2) + parseFloat(num3) + parseFloat(num4)) / 4;

  // Renderizar a página de resultado
  res.send(`
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Resultado da Média</title>
            <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f0f0f0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            
            h1 {
                color: #333;
                margin-bottom: 20px;
            }
            
            p {
                font-size: 18px;
                color: #555;
            }
            
            a {
                color: #007bff;
                text-decoration: none;
                font-weight: bold;
            }
            
            a:hover {
                text-decoration: underline;
            }
            </style>
        </head>
        <body>
            <h1>Resultado da Média</h1>
            <br/>
            <br/>
            <p>A média dos números ${num1}, ${num2}, ${num3}, ${num4} é ${media.toFixed(
    2
  )}</p>
            <br/>
            <br/>
            <a href="/">Calcular Novamente</a>
        </body>
        </html>
    `);
});

// Iniciar o servidor
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Servidor rodando na porta ${PORT}`);
});
