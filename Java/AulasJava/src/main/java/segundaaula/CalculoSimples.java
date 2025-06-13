package segundaaula;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner; // chamando a classe da biblioteca JAVA

public class CalculoSimples {

    public static void main(String[] args){
        float n1;
        float n2;
        float soma;
        float subtracao;
        float divisao;
        float multi;

        Scanner entrada = new Scanner(System.in); // instanciando a classe

        System.out.println("Entre com o primeiro número: ");
        n1 = entrada.nextFloat();
        System.out.println("Entre com o segundo número: ");
        n2 = entrada.nextFloat();

        soma = n1 + n2;
        subtracao = n1 - n2;
        divisao = n1 / n2;
        multi = n1 * n2;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subtracao);
        System.out.println("A subtração dos números é: " + divisao);
        System.out.println("A multiplicação dos números é: " + multi);
    }
}
