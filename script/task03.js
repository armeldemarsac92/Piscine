
const div = document.querySelector("footer div");
let ls = [];

document.addEventListener("keypress",(event) => {
    ls.push(event.key);
    div.innerHTML = ls.slice(-42).join("");
})


