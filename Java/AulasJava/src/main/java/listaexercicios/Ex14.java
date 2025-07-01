package listaexercicios;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        int soma = 0;
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 números para somar:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "° numero: ");
            numero = entrada.nextInt();
            soma = soma + numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);
    }
}
