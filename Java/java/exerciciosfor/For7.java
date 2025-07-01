package exerciciosfor;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        int i;
        int c;
        int soma = 0;
        int media = 0;

        Scanner entrada = new Scanner(System.in);

        for (c = 1; c <= 20; c++) {
            System.out.println("Insira a idade da " + c + "° pessoa: ");
            i = entrada.nextInt();

            soma = soma + i;
            media = soma / c;
        }

        System.out.println("Média das idades: " + media);
    }
}
