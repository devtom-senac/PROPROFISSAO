package listaexercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não eleitor.");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Eleitor obrigatório.");
        } else if ((idade >= 16 && idade < 18) || idade >= 65) {
            System.out.println("Eleitor facultativo.");
        }

    }
}
