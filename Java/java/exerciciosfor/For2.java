package exerciciosfor;

public class For2 {
    public static void main(String[] args) {
        int c;
        int soma = 0;

        for (c = 1; c <= 15; c++){
           soma = c + soma;
        }
        System.out.println("Total: " + soma);
    }
}
