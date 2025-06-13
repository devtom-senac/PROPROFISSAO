package exerciciosbasico;

public class MediaAritmetica {
    public static void main(String[] args){
        float n1 = 4;
        float n2 = 5;
        float n3 = 6;
        float n4 = 7;
        float n5 = 9;
        float n6 = 8;
        float media1 = (n1 + n2 + n3) / 3;
        float media2 = (n4 + n5 + n6) / 3;

        System.out.println("A média das notas é: " + media1);
        System.out.println("A média das notas é: " + media2);

        float soma = media1 + media2;
        float mediaGeral = soma / 2;

        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média geral é: " + mediaGeral);
    }
}
