package exerciciosfor;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        int n;
        String nome;
        int c;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite o número de vezes você quer exibi-lo ");
        n = entrada.nextInt();

        for (c = 1; c <= n; c++) {
            System.out.println(c + ":" + nome);
        }
    }
}
