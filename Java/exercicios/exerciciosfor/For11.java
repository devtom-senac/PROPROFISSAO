package exerciciosfor;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        int i;
        int c;

        Scanner entrada = new Scanner(System.in);

        int maiores = 0;
        for (c = 1; c <= 20; c++) {
            System.out.println("Insira o " + c + "° número: ");
            i = entrada.nextInt();

            if (i > 8) {
                maiores++;
            }
        }

        System.out.println("A quantidade de números maiores que 8 é: " + maiores);
    }
}
