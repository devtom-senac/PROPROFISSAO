package listaexercicios;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double saldo;
        double saldoReajustado;
        final double reajuste = 0.015;

        System.out.print("Digite o saldo atual: R$ ");
        saldo = leitor.nextDouble();

        saldoReajustado = saldo * (1 + reajuste);

        System.out.println("Saldo com reajuste de 1.5%: R$ " + String.format("%.2f", saldoReajustado));

        leitor.close();
    }
}
