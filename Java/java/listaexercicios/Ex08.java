package listaexercicios;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double porcentagemIPI;
        int codigoP1;
        double valorUnitarioPeca1;
        int quantidadePeca1;
        int codigoP2;
        double valorUnitarioPeca2;
        int quantidadePeca2;
        double valorTotal;

        System.out.print("Digite a porcentagem do IPI: ");
        porcentagemIPI = entrada.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        codigoP1 = entrada.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        valorUnitarioPeca1 = entrada.nextDouble();
        System.out.print("Digite a quantidade da peça 1: ");
        quantidadePeca1 = entrada.nextInt();

        System.out.print("Digite o código da peça 2: ");
        codigoP2 = entrada.nextInt();
        System.out.print("Digite o valor unitario da peça 2: ");
        valorUnitarioPeca2 = entrada.nextDouble();
        System.out.print("Digite a quantidade da peça 2: ");
        quantidadePeca2 = entrada.nextInt();

        double subtotal = (valorUnitarioPeca1 * quantidadePeca1) + (valorUnitarioPeca2 * quantidadePeca2);

        valorTotal = subtotal * (porcentagemIPI / 100 + 1);

        System.out.println("O valor total a ser pago é: R$ " + String.format("%.2f", valorTotal));
    }
}
