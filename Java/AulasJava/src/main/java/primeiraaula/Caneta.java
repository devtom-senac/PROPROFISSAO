package primeiraaula;

public class Caneta {
    public static void main(String[] args){
        /*ClasseCaneta caneta1 = new ClasseCaneta();
        caneta1.modelo = "esferográfica";
        caneta1.cor = "preta";
        caneta1.ponta = 0.5f;
        caneta1.carga = 70;
        caneta1.tampada = true;

        caneta1.destampar();
        caneta1.estado_atual();
        caneta1.desenhar();*/

        ClasseCaneta caneta2 = new ClasseCaneta();
        caneta2.modelo = "canetão";
        caneta2.cor = "azul";
        caneta2.ponta = 4.0f;
        caneta2.carga = 0;
        caneta2.tampada = false;

        caneta2.destampar();
        caneta2.estado_atual();
        caneta2.desenhar();
        caneta2.recarregar();
        caneta2.estado_atual();
    }
}
