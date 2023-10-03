function popup(){
    let name = ""
    while (name == ""){
        
        name = window.prompt("What's your name ?")
 
    }

    if (confirm("Are you sure " + name + " is your name ?")){
        alert("Hello " + name)
        div.innerHTML = " Hello " + name
    }
}

let clickCount = 0;
const div = document.querySelector("footer div");
div.addEventListener("click",popup)
