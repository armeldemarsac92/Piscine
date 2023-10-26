let cookieDate;
let div = document.querySelector("footer div");
let footer = document.querySelector("footer");
let buttonCookie = document.querySelector("a");
let originalHtml = footer.innerHTML;

function createDate(param) {
    let date = new Date();
    date.setDate(date.getDate() + param);
    cookieDate = date.toUTCString();
}

function createDiv() {
    footer = document.querySelector("footer");
    div = document.querySelector("footer div")
    let newDiv = document.createElement("div");
    let button = document.createElement("button");
    button.innerText = "Delete the cookie";
    newDiv.appendChild(button);
    footer.insertBefore(newDiv, div);
    button.addEventListener("click", delCookie);
}

function delCookie() {
    createDate(-10);
    document.cookie = `username=; expires=${cookieDate}`;
    footer.innerHTML = originalHtml;
    buttonCookie = document.querySelector("a");
    buttonCookie.addEventListener("click", createCookie)
}

function createCookie() {
    createDate(1);
    div = document.querySelector("footer div")
    document.cookie = `username=true; expires=${cookieDate}`;
    if (document.cookie.includes("username=true")) {
        console.log("hey");
        div.innerHTML = " ";
        createDiv();
    }
}

buttonCookie.addEventListener("click", createCookie);
