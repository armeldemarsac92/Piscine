const submitButton = document.getElementById("button_1");

submitButton.addEventListener("click", async (sendrequest)=>{
    let action = "add_element";
    let type = document.getElementById("type_1").value;
    let brand = document.getElementById("brand_1").value;
    const response2 = await fetch(`task04.php?action=${action}&brand=${brand}&type=${type}`, {
        method: "GET", // *GET, POST, PUT, DELETE, etc.
    });
    if (response2.status === 200){
        const responseData = await response2.json();
        console.log(responseData);
        if (responseData.status === "success"){
            alert(responseData.status + "\nData inserted successfully");
        }} else {
        alert("Invalid request");
    }
})