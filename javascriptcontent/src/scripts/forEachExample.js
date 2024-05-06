'use strict';

const btnModificar = document.getElementById('btnModificar');
const lista = document.querySelectorAll('ul li');

btnModificar.addEventListener('click', () => {
    lista.forEach((item) => {
        item.textContent = 'Item Modificado';
        item.style.color = 'white';
        item.style.backgroundColor = 'blue'
    });
});