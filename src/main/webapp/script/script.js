function toggleTranslation() {
    document.querySelector('.story-container').classList.toggle('active');

    let header = document.getElementById("header");
    if (header.innerText === "Island of Secrets") {
        header.innerText = "Острів Таємниць"
    } else {
        header.innerText = "Island of Secrets";
    }

    let translate = document.getElementById("translate-button");
    if (translate.textContent === "Перекласти") {
        translate.textContent = "Translate"
    } else {
        translate.textContent = "Перекласти";
    }

    let start = document.getElementById("start-button");
    if (start.textContent === "Start") {
        start.textContent = "Почати"
    } else {
        start.textContent = "Start";
    }
}

function redirectToStart() {
    let startURL = '/game';
    let classList = document.querySelector(`.active`).classList;
    if (classList.contains('eng')) {
        startURL += '?lang=eng';
    } else {
        startURL += '?lang=ukr';
    }

    window.location.href = startURL;
}

function redirectToWelcome() {
    window.location.href = '/';
}