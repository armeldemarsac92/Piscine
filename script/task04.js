const button = document.querySelectorAll("button");
const text = document.querySelectorAll("p");
const menu = document.querySelector("select");
const background = document.querySelector("body");
let textSize = parseInt(window.getComputedStyle(text[0]).fontSize);
console.log(textSize);

background.style.backgroundColor = menu.value;


function decreaseTextSize(){
    textSize = textSize-1;
    for (let i=0; i<text.length;i++){
        text[i].style.cssText = ("font-size:"+textSize+"px")
    };
    
    console.log(textSize);

};

function increaseTextSize(){
    textSize = textSize+1;
    for (let i=0; i<text.length;i++){
        text[i].style.cssText = ("font-size:"+textSize+"px")
    };
    
    console.log(textSize);

};

menu.addEventListener("click",()=>{
    console.log(menu.options[menu.selectedIndex].text);
    background.style.backgroundColor = menu.value;
})


button[1].addEventListener("click",decreaseTextSize);
button[0].addEventListener("click",increaseTextSize);

