let i = 0;
function counting() {
  i++;
  postMessage(i);
  setTimeout("counting()", 1000);
  console.log(i);
}
counting();
