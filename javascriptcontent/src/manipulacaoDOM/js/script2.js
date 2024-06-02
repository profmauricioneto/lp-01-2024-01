function newLanguage() {
  let inputFields = document.getElementsByTagName("input");
  let newLine = document.createElement("tr");
  let table = document.getElementsByTagName("tbody");

  for (let i = 0; i < inputFields.length; i++) {
    if (inputFields[i].value === "") {
      window.alert("Write Something in Language or Level!");
    } else {
      var newColumn = document.createElement("td");
      newColumn.innerHTML = inputFields[i].value;
      newLine.appendChild(newColumn);
      inputFields[i].value = "";
    }
  }
  table[0].appendChild(newLine);
}
