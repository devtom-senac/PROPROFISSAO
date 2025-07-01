package listaexercicios;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo;
        double vendasEfetuadas;
        double comissao;
        double salarioFinal;
        final double percentualComissao = 0.15; // 15% em decimal

        System.out.print("Entre com o nome do vendedor: ");
        nomeVendedor = leitor.nextLine(); // Usa nextLine() para ler o nome completo

        System.out.print("Digite o salário fixo do vendedor: R$ ");
        salarioFixo = leitor.nextDouble();

        System.out.print("Digite o valor total de vendas efetuadas no mês: R$ ");
        vendasEfetuadas = leitor.nextDouble();

        comissao = vendasEfetuadas * percentualComissao;
        salarioFinal = salarioFixo + comissao;

        System.out.println("Vendedor: " + nomeVendedor);
        System.out.println("Salário Fixo: R$ " + String.format("%.2f", salarioFixo));
        System.out.println("Salário Final do Mês: R$ " + String.format("%.2f", salarioFinal));
    }
}
