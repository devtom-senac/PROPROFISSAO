package exerciciosfor;

import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        int i;
        int c;

        Scanner entrada = new Scanner(System.in);

        int maiores = 0;
        for (c = 1; c <= 20; c++) {
            System.out.println("Insira a idade da " + c + "° pessoa: ");
            i = entrada.nextInt();

            if (i >= 18) {
                maiores++;
            }
        }

        System.out.println("Pessoas maiores de idade: " + maiores);
    }
}