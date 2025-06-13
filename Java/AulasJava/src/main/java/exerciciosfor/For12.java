package exerciciosfor;

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        int i;
        int c;

        Scanner entrada = new Scanner(System.in);

        int pares = 0;
        for (c = 1; c <= 20; c++) {
            System.out.println("Insira o " + c + "° número: ");
            i = entrada.nextInt();

            if (i % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
    }
}
