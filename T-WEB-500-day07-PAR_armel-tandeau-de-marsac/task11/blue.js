let paragraphs = document.querySelectorAll("p")

function blue(){
    paragraphs.forEach((paragraph)=>{
        paragraph.addEventListener("mouseover",()=>{
            console.log("hover !")
            paragraph.classList.add("blue")
        });
        paragraph.addEventListener("click",()=>{
            console.log("click !")
            console.log(paragraph.className)
            if (!paragraph.classList.contains("highlight")){
                paragraph.classList.add("highlight")
            }
            else{
                paragraph.classList.remove("highlight")
            }
            
        })

    })
}

blue()
