let list = document.querySelectorAll("li");

list.forEach((element) =>{
    let links = element.querySelectorAll(":not([target=_blank])");
    links.forEach((link) =>{
        link.style.cssText = "opacity:0.5";
    })
})

