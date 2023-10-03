addEventListener("load",() => {
    const div = document.querySelector("footer div");
    let clickCount = 0;
    div.addEventListener("click", () => {
        clickCount ++;
        div.innerHTML = clickCount
    });
});
