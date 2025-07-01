package listaexercicios;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int idade;
        int somaIdades = 0;
        int pessoas = 0;
        int mediaIdades;

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "° pessoa: ");
            idade = entrada.nextInt();
            somaIdades = somaIdades + idade;
            pessoas++;
        }

        mediaIdades = somaIdades / pessoas;

        System.out.println("A média das idade é: " + mediaIdades);
    }
}
