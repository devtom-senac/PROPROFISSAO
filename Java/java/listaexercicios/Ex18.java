package listaexercicios;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da " + i + "° pessoa: ");
            String nomeAtual = entrada.nextLine();

            System.out.print("Digite a idade da " + i + "° pessoa: ");
            int idadeAtual = entrada.nextInt();
            entrada.nextLine();

            System.out.println("");

            if (idadeAtual < idadeMaisNova) {
                idadeMaisNova = idadeAtual;
                nomeMaisNova = nomeAtual;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNova + " idade: " + idadeMaisNova + " anos.");

        entrada.close();
    }
}
