// create the presets of code
const presets = {
    letters_lowercase: 'abcdefghijklmnopqrstuvwxyz',
    letters_uppercase: 'ABCDEFGHIJKLMNOPQRSTUVWXYZ',
    numbers: '0123456789',
    symbols: "!@#$%^&*()_+~\\`|}{[]:;?><,./-="
}

const functions_presets = [
    function uppercase() {
        let my_uppercase = presets.letters_uppercase[Math.floor(Math.random() * presets.letters_uppercase.length)];
        return my_uppercase;
    },

    function lowercase() {
        let my_lowercase = presets.letters_lowercase[Math.floor(Math.random() * presets.letters_lowercase.length)];
        return my_lowercase;
    },

    function number() {
        let my_numbers = presets.numbers[Math.floor(Math.random() * presets.numbers.length)]
        return my_numbers;
    },

    function symbol() {
        let my_symbols = presets.symbols[Math.floor(Math.random() * presets.symbols.length)];
        return my_symbols;
    }
]

function generatePassword() {
    const symbol = document.getElementById('symbol').checked;
    const number = document.getElementById('number').checked;
    const lower = document.getElementById('lowercase').checked;
    const upper = document.getElementById('uppercase').checked;
    if (symbol + number + lower + upper === 0) {
        window.alert('You must be check one of this options')
        return;
    }

    const length_pass = document.getElementById('length');
    const box = document.getElementById('passwordOutput');
    let my_password = "";
    while (length_pass.value > my_password.length) {
        let presets = functions_presets[Math.floor(Math.random() * functions_presets.length)];
        let isChecked = document.getElementById(presets.name).checked;
        if (isChecked) {
            my_password += presets();
        }
    }
    box.innerHTML = my_password;
}

// copy function
function copy() {
    const copy_password = document.createElement('passwordcopy');
    const password = document.getElementById('passwordOutput').innerHTML;
    if (!password) {
        window.alert('There is no password inm this field!');
        return;
    }

    // Here there are to ways to made this copy...
    if (!navigator.clipboard) {
        copy_password.value = password;
        document.body.appendChild(copy_password);
        document.execCommand('copy');
        copy_password.remove();
        window.alert('Password copied with success!');
    } else {
        navigator.clipboard.writeText(password)
        .then(
            function() {
                window.alert('Password copied with success!')
            })
        .catch(
            function() {
                window.alert('Error in copied password')
            }
        )
    }
}