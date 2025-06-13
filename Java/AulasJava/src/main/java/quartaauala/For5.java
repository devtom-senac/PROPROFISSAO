package quartaauala;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        int n;
        int c;
        int par = 0;
        int impar = 0;
        int quantidadeNumeros;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos números você quer verificar: ");
        quantidadeNumeros = entrada.nextInt();

        for (c = 1; c <= quantidadeNumeros; c++) {
            System.out.println("Insira o número " + c + ": ");
            n = entrada.nextInt();

            if (n % 2 == 0) {
                par++;
                System.out.println("O número " + n + " é par.");
            } else {
                impar++;
                System.out.println("O número " + n + " é ímpar.");
            }
        }

        System.out.println("\nTotal de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar);
    }
}

