package exerciciosbasico;
import java.util.Scanner;

public class Calculo {
    public static void main(String[] args){

        float numero1;
        float numero2;
        float soma;
        float subtracao;
        float divisao;
        float multi;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número; ");
        numero1 = entrada.nextFloat();

        System.out.println("Entre com o segundo número; ");
        numero2 = entrada.nextFloat();


        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        divisao = numero1 / numero2;
        multi = numero1 * numero2;

        System.out.println("O resultado da soma dos dois números é: " + soma);
        System.out.println("O resultado da subtração dos dois números é: " + subtracao);
        System.out.println("O resultado da divisão dos dois números é: " + divisao);
        System.out.println("O resultado da multiplicação dos dois números é: " + multi);
    }
}
