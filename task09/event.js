let button = document.getElementsByTagName("button");

function delParagraphs(){
    let paragraphs = document.querySelectorAll("p");
    paragraphs.forEach((paragraph) => {
        paragraph.innerHTML = "";
    });
}

button[0].addEventListener("click", delParagraphs);
