package listaexercicios;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int n;
        int a;
        int s;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        n = entrada.nextInt();

        a = n - 1;
        s = n + 1;

        System.out.println("Número digitado: " + n + "\nAntecessor: " + a + "\nSucessor: " + s);
    }
}
