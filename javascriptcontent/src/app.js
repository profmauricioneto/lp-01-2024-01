const express = require("express");
const fs = require("fs");
const path = require("path");

const port = 3000;
const app = express();

app.get("/", (req, res) => {
  fs.readFile("src/index.html", function (error, data) {
    if (error) {
      res.writeHead(404);
      res.write("Error: File not found");
    } else {
      res.writeHead(200, { "Content-Type": "text/html" });
      res.write(data, 'utf-8');
      res.end();
    }
  });
});

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
