package exerciciosfor;

import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        int i;
        int c;
        String nome;
        String nMaisNova = "";
        int iMaisNova = Integer.MAX_VALUE;

        Scanner entrada = new Scanner(System.in);

        for (c = 1; c <= 20; c++) {
            System.out.println("Insira o nome da " + c + "° pessoa: ");
            nome = entrada.nextLine();

            System.out.println("Insira a idade de " + nome + ": ");
            i = entrada.nextInt();
            entrada.nextLine();

            if (i < iMaisNova) {
                iMaisNova = i;
                nMaisNova = nome;
            }
        }

        System.out.println("O nome da pessoa mais nova é: " + nMaisNova);
    }
}
