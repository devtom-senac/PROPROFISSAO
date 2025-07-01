package primeiraaula;

public class ClasseCaneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar(){
        if(this.tampada==true) {
            System.out.println("Erro! A caneta está tampada");
        } else{
            System.out.println("Estou rabiscando");
        }
    }

    void desenhar(){
        if(this.tampada==true) {
            System.out.println("Não dapara desenhar. Estou tampada");
        } else{
            System.out.println("Estou desenhando");
        }
    }

    void tampa(){
    this.tampada = true;
    }

    void destampar(){
        this.tampada = true;
    }

    public void recarregar() {
        this.carga = 100;
    }

    void estado_atual(){
        System.out.println("Esta caneta é do modelo: " + this.modelo);
        System.out.println("Esta caneta tem a cor: " + this.cor);
        System.out.println("Esta caneta tem a ponta: " + this.ponta);
        System.out.println("Esta caneta está com a carga em: " + this.carga + "%");
        System.out.println("Esta caneta está tampada?: " + this.tampada);
        System.out.println("Caneta recarregada.");
    }
}
