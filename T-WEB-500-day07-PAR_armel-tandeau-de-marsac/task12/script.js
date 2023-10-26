const menu = document.getElementById("container1")
let button = document.querySelectorAll("button")


function addElement(tag, style,parent,text){
    let newElement = document.createElement(tag);
    if (style) {
        newElement.className = style;
    }
    if (text) {
        newElement.innerHTML = text;
    }
    parent.appendChild(newElement)
    return newElement
}
    
button[0].addEventListener("click",()=>{
    let option = document.getElementById("dropdown1").value;
    let input = document.querySelector("input").value;
    let newDiv = document.querySelector("newDiv");
    if (input != ""){
        if (!menu.querySelector("newDiv")){
            newDiv = addElement("newDiv","box",menu);
            let ul = addElement("ul",undefined,newDiv);
            addElement("li",option,ul,input);
        } else{
            let ul = newDiv.querySelector("ul");
            addElement("li",option,ul,input)
        }
        console.log(option);
    }
});
