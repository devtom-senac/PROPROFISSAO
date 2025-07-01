package listaexercicios;

public class Ex07 {
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 9;
        int n3 = 7;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;

        double media1 = (double) (n1 + n2 + n3) / 3;
        double media2 = (double) (n4 + n5 + n6) / 3;
        double somaDasMedias = media1 + media2;
        double mediaDasMedias = (media1 + media2) / 2;

        System.out.println("A média dos números 8, 9 e 7 é: " + media1);
        System.out.println("A média dos números 4, 5 e 6 é: " + media2);
        System.out.println("Soma das duas médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}
