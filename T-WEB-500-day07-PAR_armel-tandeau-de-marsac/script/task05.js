const control = document.getElementsByTagName("button")
const div = document.querySelector("canvas")
const audio = new Audio(document.querySelector("pre").textContent.trim())

function go(){
    audio.play();
}

function pause(){
    audio.pause();
}

function stop(){
    audio.pause();
    audio.currentTime = 0;
}

function mute(){
    if (audio.mute == false){
        audio.mute = true
        console.log("muted")
    }
    else{
        audio.mute = false
        console.log("unmuted")
    }
}

function draw() {
    const canvas = document.querySelector("canvas");
    if (canvas.getContext) {
      const line = canvas.getContext("2d");
      line.beginPath();
      line.moveTo(6, 6);
      line.lineTo(14, 10);
      line.lineTo(6, 14);
      line.closePath();
      line.strokeStyle = "white";
      line.stroke();
    }
  }
  
draw();

div.addEventListener("click",(go));

control[0].addEventListener("click",(pause));

control[1].addEventListener("click",(stop));

control[2].addEventListener("click",(mute));

