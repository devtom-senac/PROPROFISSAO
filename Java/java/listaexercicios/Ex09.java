package listaexercicios;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        final double salarioMin = 1212.00;
        double salarioUsuario;
        double quantidadeSalariosMin;

        System.out.print("Digite o valor do seu salário: R$ ");
        salarioUsuario = leitor.nextDouble();

        quantidadeSalariosMin = salarioUsuario / salarioMin;

        System.out.println("Você ganha o equivalente a " + String.format("%.2f", quantidadeSalariosMin) + " salários minimos.");

        leitor.close();
    }

}
