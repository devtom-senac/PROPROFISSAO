package listaexercicios;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int somaIdades = 0;
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade de 20 pessoas:");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "° pessoa: ");
            idade = entrada.nextInt();
            somaIdades = somaIdades + idade;
        }

        System.out.println("A soma das idades é: " + somaIdades);
    }
}
