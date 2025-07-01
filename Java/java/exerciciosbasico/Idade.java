package exerciciosbasico;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int ano, mes, dia, total;

        System.out.println("Digite quantos anos tem: ");
        ano = entrada.nextInt();

        System.out.println("Digite quantos meses tem: ");
        mes = entrada.nextInt();

        System.out.println("Digite quantos dias tem: ");
        dia = entrada.nextInt();

        total = (ano * 365) + (mes * 30) + dia;

        System.out.println("Você tem " + total + " dias de vida.");

    }
}
