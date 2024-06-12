const express = require("express");
const bodyParser = require("body-parser");
const fs = require("fs");
const path = require("path");

const port = 3000;
const app = express();

let urlencodedParser = bodyParser.urlencoded({ extended: true });
// app.use(express.static(path.join(__dirname, "public/views")));

app.get("/", (req, res) => {
  fs.readFile('src/node/exercicio0/index.html', (err, data) => {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.write(data);
    res.end();
  });
});

app.post("/form", urlencodedParser, function (req, res) {
  fs.readFile('src/node/exercicio0/form.html', function (err, data) {
    var today = new Date();
    var values = {
      name: req.body.name,
      year: req.body.birthYear,
      age: today.getFullYear() - parseInt(req.body.birthYear),
    };

    console.log(values);

    for (var key in values) {
        data = data.toString().replace("{{" + key + "}}", values[key]);
    }

    if(err) {
        res.writeHead(404, { "Content-Type": "text/html" });
        res.write("Not Found!");
        res.end();
    } else {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.write(data);
    res.end();
    }
  });
});

app.listen(port, () => {
  console.log(`Servidor rodando na porta http://localhost:${port}`);
});
