package exerciciosfor;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        String nome;
        int c;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        for (c = 1; c <= 10; c++) {
            System.out.println(c + ": " + nome);
        }
    }
}
