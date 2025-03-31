function exibe_camada1(){
    document.getElementById("camada1").style.visibility = "visible"
    document.getElementById("camada2").style.visibility = "hidden"
    document.getElementById("camada3").style.visibility = "hidden"
}

function exibe_camada2(){
    document.getElementById("camada1").style.visibility = "hidden"
    document.getElementById("camada2").style.visibility = "visible"
    document.getElementById("camada3").style.visibility = "hidden"
}

function exibe_camada3(){
    document.getElementById("camada1").style.visibility = "hidden"
    document.getElementById("camada2").style.visibility = "hidden"
    document.getElementById("camada3").style.visibility = "visible"
}

function some_tudo(){
    document.getElementById("camada1").style.visibility = "hidden"
    document.getElementById("camada2").style.visibility = "hidden"
    document.getElementById("camada3").style.visibility = "hidden"
}


