let bookmarkFormEl = document.getElementById("bookmarkForm");
let siteNameInputEl = document.getElementById("siteNameInput");
let siteUrlInputEl = document.getElementById("siteUrlInput");
let submitBtnEl = document.getElementById("submitBtn");
let siteNameErrMsgEl = document.getElementById("siteNameErrMsg");
let siteUrlErrMsgEl = document.getElementById("siteUrlErrMsg");
let bookmarksListEl = document.getElementById("bookmarksList");
let newConEl = document.getElementById("newCon");

function startUp() {
    newConEl.classList.remove("d-none");

    let listElement = document.createElement('li');
    bookmarksList.appendChild(listElement);
    listElement.classList.add("form-cont", "d-flex", "flex-row", "mt-4", "mb-4");

    let paraElement = document.createElement('p');
    listElement.appendChild(paraElement);
    paraElement.textContent = siteNameInputEl.value;
    paraElement.classList.add("list-para");

    let ancherEl = document.createElement('a');
    listElement.appendChild(ancherEl);
    ancherEl.href = siteUrlInputEl.value;
    ancherEl.classList.add("ml-auto");
}

submitBtnEl.addEventListener("click", startUp);

siteNameInputEl.addEventListener("change", function(event) {
    if (event.target.value === "") {
        siteNameErrMsgEl.textContent = "Required*";
        siteNameErrMsgEl.classList.add("error");
    } else {
        siteNameErrMsgEl.textContent = "";
    }
});

siteUrlInputEl.addEventListener("change", function(event) {
    if (event.target.value === "") {
        siteUrlErrMsgEl.textContent = "Required*";
        siteUrlErrMsgEl.classList.add("error");
    } else {
        siteUrlErrMsgEl.textContent = "";
    }
});

function validateInput() {
    if (siteNameInputEl.value === "") {
        siteNameErrMsgEl.textContent = "Required*";
        siteNameErrMsgEl.classList.add("error");
    }
    if (siteUrlInputEl.value === "") {
        siteUrlErrMsgEl.textContent = "Required*";
        siteUrlErrMsgEl.classList.add("error");
    }
}

submitBtnEl.addEventListener("click", startUp);

bookmarkFormEl.addEventListener('submit', function(event) {
    event.preventDefault();
    validateInput();
});