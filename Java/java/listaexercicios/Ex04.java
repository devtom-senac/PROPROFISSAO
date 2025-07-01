package listaexercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int valor3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro:");
        valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor inteiro:");
        valor2 = entrada.nextInt();

        System.out.println("Digite o terceiro valor inteiro:");
        valor3 = entrada.nextInt();

        int[] numeros = {valor1, valor2, valor3};

        Arrays.sort(numeros);

        System.out.println("Os valores em ordem descendente são:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
