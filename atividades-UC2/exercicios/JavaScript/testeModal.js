function abrirModal(){
    let modal = document.querySelector('.modal');
    let janelaEscura = document.querySelector('.janelaEscura');
    let imagem = document.querySelector('.imagem');

    modal.style.visibility='visible'
    janelaEscura.style.visibility='visible'
    imagem.style.visibility='visible'
}

function fecharModal(){
    let modal = document.querySelector('.modal');
    let janelaEscura = document.querySelector('.janelaEscura');
    let imagem = document.querySelector('.imagem');

    modal.style.visibility='hidden'
    janelaEscura.style.visibility='hidden'
    imagem.style.visibility='hidden'
}
