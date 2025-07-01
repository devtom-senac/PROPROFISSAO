package exerciciosfor;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        int n;
        int c;
        int soma = 0;

        Scanner entrada = new Scanner(System.in);

        for (c = 1; c <= 10; c++) {
            System.out.println("Insira o número " + c + ": ");
            n = entrada.nextInt();

            soma = soma + n;
        }

        System.out.println("Total: " + soma);
    }
}
