function toggleTranslation() {
    document.querySelector('.story-container').classList.toggle('active');

    let header = document.getElementById("header");
    if (header.innerText === "Lost at Sea: Escape from the Island of Mysteries") {
        header.innerText = "Загублений в морі: Втеча з острова таємниць"
    } else {
        header.innerText = "Lost at Sea: Escape from the Island of Mysteries";
    }

    let translate = document.getElementById("translate-button");
    if (translate.textContent === "Translate") {
        translate.textContent = "Перекласти"
    } else {
        translate.textContent = "Translate";
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