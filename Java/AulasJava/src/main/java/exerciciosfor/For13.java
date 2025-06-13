package exerciciosfor;

import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        int i;
        int c;

        Scanner entrada = new Scanner(System.in);

        int entreZeroECem = 0;
        for (c = 1; c <= 5; c++) {
            System.out.println("Insira o " + c + "° número: ");
            i = entrada.nextInt();

            if (i >= 0 && i <= 100) {
                entreZeroECem++;
            }
        }

        System.out.println("A quantidade de números entre 0 e 100 é: " + entreZeroECem);
    }
}
