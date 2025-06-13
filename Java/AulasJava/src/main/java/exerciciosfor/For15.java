package exerciciosfor;

import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        int n;
        int c;
        int s = 0;

        Scanner entrada = new Scanner(System.in);

        for (c = 1; c <= 20; c++) {
            System.out.println("Insira o " + c + "° número ou digite um número negativo para encerrar: ");
            n = entrada.nextInt();

            if (n >= 0) {
                s = s + n;
            } else {
                System.out.println("Soma encerrada.");
                System.out.println("Total: " + s);
                return;
            }
        }
    }
}
