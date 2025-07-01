package exerciciosbasico;
import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args){
       int n;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n = entrada.nextInt();

        int antecessor = n + 1;
        int sucessor = n - 1;

        System.out.println("O antecessor de: " + n + " é: " + antecessor + " e o sucessor é: " + sucessor );
    }
}
