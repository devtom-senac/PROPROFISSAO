package listaexercicios;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int idade;
        int maioresDeIdade = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da " + i + "° pessoa: ");
            idade = entrada.nextInt();

            if (idade >= 18) {
                maioresDeIdade++;
            }
        }

        System.out.println("Número de pessoas maiores de idade: " + maioresDeIdade);
    }
}
