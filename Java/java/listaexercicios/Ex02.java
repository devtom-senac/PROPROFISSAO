package listaexercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int n;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        n = entrada.nextInt();

        if (n % 10 == 0) {
            System.out.println("O número " + n + " é divisivel por 10.");
        } else if (n % 5 == 0) {
            System.out.println("O número " + n + " é divisivel por 5.");
        } else if (n % 2 == 0) {
            System.out.println("O número " + n + " é divisivel por 2.");
        } else {
            System.out.println("O digitado número " + n + " não é divisivel por 10, por 5, nem por 2.");
        }
    }
}
