// verificacao os campos do formulário através da API de validação de formulários do HTML5

document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementsByTagName('form');

    form[0].addEventListener('submit', function(event) {
        if (!form.checkValidity()) {
            event.preventDefault();
            event.stopPropagation();
            validateForm();
        } else {
            alert('Form submitted successfully!');
        }
        form.classList.add('was-validated');
    });

    const inputs = form[0].querySelectorAll('input');
    inputs.forEach( (input) => {
        input.addEventListener('input', function() {
            validateInput(input);
        });
    });

    
    function validateForm() {
        inputs.forEach(input => {
            validateInput(input);
        });
    }


    function validateInput(input) {
        const errorElement = document.getElementById(input.name + "Error");

        if (input.validity.valid) {
            errorElement.textContent = "";
            input.classList.add("valid");
            input.classList.remove("invalid");
        } else {
            showErrorMessage(input, errorElement);
            input.classList.add("invalid");
            input.classList.remove("valid");
        }
    }

    function showErrorMessage(input, errorElement) {
        if (input.validity.valueMissing) {
            errorElement.innerHTML = `${input.name} is required.`;
        } else if (input.validity.typeMismatch) {
            errorElement.innerHTML = `Please enter a valid ${input.type}.`;
        } else if (input.validity.tooShort) {
            errorElement.innerHTML = `${input.name} should be at least ${input.minLength} characters; you entered ${input.value.length}.`;
        }
    }
});
