package exerciciosfor;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        int n;
        int c;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        n = entrada.nextInt();

        for (c = 1; c <= 10; c++)
            System.out.println(n + " x " + c + " = " + (n * c));
    }
}


