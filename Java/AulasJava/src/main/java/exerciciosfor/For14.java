package exerciciosfor;

import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        int i;
        int c;

        Scanner entrada = new Scanner(System.in);

        int entreZeroECem = 0;
        int entre101E200 = 0;
        int maiorQue200 = 0;
        for (c = 1; c <= 20; c++) {
            System.out.println("Insira o " + c + "° número: ");
            i = entrada.nextInt();

            if (i >= 0 && i <= 100) {
                entreZeroECem++;
            } else if (i >= 101 && i <= 200) {
                entre101E200++;
            } else if (i >= 200) {
                maiorQue200++;
            }
        }

        System.out.println("A quantidade de números entre 0 e 100 é: " + entreZeroECem);
        System.out.println("A quantidade de números entre 101 e 200 é: " + entre101E200);
        System.out.println("A quantidade de números maior que 200 é: " + maiorQue200);
    }
}
