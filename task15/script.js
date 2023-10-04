const menu = document.getElementById("container1")
let button = document.querySelectorAll("button")
let searchField = document.getElementById("search field")
let dropdownField = document.getElementById("dropdown field")
let searchParameter = 1


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

function myClickHandlerSearch(){
    if (dropdownField.style.border != ""){
        dropdownField.style.removeProperty("border");
    };
    handleClickSearch();
}

function myClickHandlerDrop(){
    if (searchField.style.border != ""){
        searchField.style.removeProperty("border");
    };
    handleClickDrop();
}

function handleMouseOverSearch() {
    searchField.style.transition = ".2s ease-in-out 0s";
    searchField.style.cursor = "pointer";
    searchField.style.transform = "scale(1.05)";
}

function handleMouseOutSearch() {
    searchField.style.transform = "scale(1)";
}

function handleMouseOverDrop(){
    dropdownField.style.transition = ".2s ease-in-out 0s";
    dropdownField.style.cursor = "pointer";
    dropdownField.style.transform = "scale(1.05)";
}
    
function handleMouseOutDrop(){
    dropdownField.style.transform = "scale(1)"
}

function handleClickSearch(){
    searchField.style.border = "solid green 1px";
    searchParameter = 2;
}

function handleClickDrop(){
    dropdownField.style.border = "solid green 1px";
    searchParameter = 3;
}

button[0].addEventListener("click",()=>{
    let option = document.getElementById("dropdown1").value;
    let input = document.querySelector("input").value;
    let newDiv = document.querySelector("newDiv");
    let tags = document.getElementById("tags").value.split(",");
    console.log(tags)
    if (input != ""){
        if (!menu.querySelector("newDiv")){
            newDiv = addElement("newDiv","box",menu);
            let ul = addElement("ul",undefined,newDiv);
            let li = addElement("li",option,ul);
            let div1 = addElement("div",`header-${option}`,li)
            addElement("p","cards-text",div1,option)
            let div2 = addElement("div",undefined,li)
            addElement("p","cards-text",div2,input)
            let div3 = addElement("div",`footer-${option}`,li)
            tags.forEach(tag=>{
                addElement("p","tag",div3,tag)
            })

            
        } else{
            let ul = newDiv.querySelector("ul");
            let li = addElement("li",option,ul);
            let div1 = addElement("div",`header-${option}`,li)
            addElement("p","cards-text",div1,option)
            let div2 = addElement("div",undefined,li)
            addElement("p","cards-text",div2,input)
            let div3 = addElement("div",`footer-${option}`,li)
            tags.forEach(tag=>{
                addElement("p","tag",div3,tag)
            })
        }
        console.log(option);
    }
});


button[2].addEventListener("click",()=>{
    if (menu.querySelector("newDiv")){
        if (searchParameter === 1 && document.getElementById("search1").value != ""){
            list = menu.querySelector("ul");
            console.log("click");
            /*here the code checks the dropdown value*/
            let option2 = document.getElementById("dropdown2").value;
            /*here we check for the input and define it as searchExpression*/
            let searchExpression = document.getElementById("search1").value;
            /*we then create a list matching the above parameters*/
            let elementsToHide = Array.from(list.querySelectorAll("li"))
                .filter(element => {
                    return !element.classList.contains(option2) || !element.textContent.includes(searchExpression);
                });
            console.log(elementsToHide);
            elementsToHide.forEach(element=>{
                if (element.style.display === ""){
                    element.style.display = "none";
                } 
            })
        }
        if (searchParameter === 2 &&  document.getElementById("search1").value != ""){
            list = menu.querySelector("ul");
            console.log("click");
            /*here we check for the input and define it as searchExpression*/
            let searchExpression = document.getElementById("search1").value;
            /*we then create a list matching the above parameters*/
            let elementsToHide = Array.from(list.querySelectorAll("li"))
                .filter(element => {
                    return !element.textContent.includes(searchExpression);
                });
            console.log(elementsToHide);
            elementsToHide.forEach(element=>{
                if (element.style.display === ""){
                    element.style.display = "none";
                } 
            })
        }
        if (searchParameter === 3){
            list = menu.querySelector("ul");
            console.log("click");
            /*here the code checks the dropdown value*/
            let option2 = document.getElementById("dropdown2").value;
            /*we then create a list matching the above parameters*/
            let elementsToHide = Array.from(list.querySelectorAll("li"))
                .filter(element => {
                    return !element.classList.contains(option2);
                });
            console.log(elementsToHide);
            elementsToHide.forEach(element=>{
                if (element.style.display === ""){
                    element.style.display = "none";
                } 
                
            })
        }
    }
})

button[1].addEventListener("click", () => {
    if (button[1].textContent === "AND") {
        searchParameter = 0;
        button[1].textContent = "OR";
        searchField.addEventListener("mouseover", handleMouseOverSearch);
        searchField.addEventListener("mouseout", handleMouseOutSearch);
        dropdownField.addEventListener("mouseover",handleMouseOverDrop);
        dropdownField.addEventListener("mouseout", handleMouseOutDrop);
        searchField.addEventListener("click", myClickHandlerSearch);
        dropdownField.addEventListener("click", myClickHandlerDrop);
    } else {
        searchParameter = 1;
        button[1].textContent = "AND";
        searchField.removeEventListener("mouseover", handleMouseOverSearch);
        searchField.removeEventListener("mouseout", handleMouseOutSearch);
        dropdownField.removeEventListener("mouseover",handleMouseOverDrop);
        dropdownField.removeEventListener("mouseout", handleMouseOutDrop);
        searchField.removeEventListener("click", myClickHandlerSearch);
        dropdownField.removeEventListener("click", myClickHandlerDrop);
        dropdownField.style.removeProperty("border");
        searchField.style.removeProperty("border");
    }
});

button[3].addEventListener("click",()=>{
    let elementsToHide = Array.from(list.querySelectorAll("li"));
    elementsToHide.forEach(element=>{
        element.style.display="";
    });
    document.getElementById("search1").value = "";
});