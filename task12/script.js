const body = document.querySelector("body")
let button = document.getElementsByTagName("button")


function addElement(tag, style,parent,text){
    let newElement = document.createElement(tag);
    newElement.className = style;
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
    let option = document.querySelector("select").value
    let input = document.querySelector("input").value
    let newDiv = document.querySelector("newDiv")
    if (!body.querySelector("newDiv")){
        newDiv = addElement("newDiv","box",body)
        let ul = addElement("ul",undefined,newDiv)
        addElement("li",option,ul,input)
    } else{
        let ul = newDiv.querySelector("ul");
        addElement("li",option,ul,input)
    }
    console.log(option)
});
