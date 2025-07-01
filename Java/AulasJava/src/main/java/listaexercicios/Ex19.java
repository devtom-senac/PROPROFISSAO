package listaexercicios;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        double cotacaoDolar;
        double quantidadeDolares;
        double valorEmReais;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da cotação do dólar: US$ ");
        cotacaoDolar = entrada.nextDouble();

        System.out.print("Digite quantos dólares você tem: US$ ");
        quantidadeDolares = entrada.nextDouble();

        valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.println("O valor equivalente em Reais (R$) é: " + String.format("%.2f", valorEmReais));

        entrada.close();
    }
}
