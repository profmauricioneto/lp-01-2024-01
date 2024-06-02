var listElement = document.getElementsByTagName("LI");
var i;
for (i = 0; i < listElement.length; i++) {
    var span = document.createElement("SPAN");
    var closeElement = document.createTextNode("x");
    span.className = "close";
    span.appendChild(closeElement);
    listElement[i].appendChild(span);
}

var closeEl = document.getElementsByClassName("close");
var i;
for (i = 0; i < closeEl.length; i++) {
    closeEl[i].onclick = function() {
        var div = this.parentElement;
        div.style.display = "none";
    }
}

var listItem = document.querySelector("UL");
listItem.addEventListener("click", function(event) {
        if (event.target.tagName === "LI") {
            event.target.classList.toggle("checked");
        }
    }, false);

function createNewElement() {
    var li = document.createElement("li");
    var inputValue = document.getElementById("todoItem").value;
    var t = document.createTextNode(inputValue);
    li.appendChild(t);
    if (inputValue === '') {
      alert("You must write something!");
    } else {
      document.getElementById("todo-item").appendChild(li);
    }
    document.getElementById("todoItem").value = "";
  
    var span = document.createElement("SPAN");
    var txt = document.createTextNode("x");
    span.className = "close";
    span.appendChild(txt);
    li.appendChild(span);
  
    for (i = 0; i < closeEl.length; i++) {
        closeEl[i].onclick = function() {
        var div = this.parentElement;
        div.style.display = "none";
      }
    }
  }