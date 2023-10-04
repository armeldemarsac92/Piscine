let button = document.getElementsByTagName("button");
let body = document.querySelector("body")

function append(){
    let input = document.getElementById("form").value;
    let div = document.getElementById("div");
    let paragraph = document.createElement("p");
    paragraph.textContent = input;
    let newDiv = document.createElement("div");
    newDiv.appendChild(paragraph);
    body.insertBefore(newDiv,div);
}

button[0].addEventListener("click",(append))