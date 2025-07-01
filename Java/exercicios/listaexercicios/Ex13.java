package listaexercicios;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        double temperaturaC;
        double temperaturaF;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        temperaturaC = entrada.nextDouble();

        temperaturaF = (9 * temperaturaC + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + String.format("%.2f", temperaturaF) + "°F");

        entrada.close();
    }
}
