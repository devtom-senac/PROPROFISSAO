package exerciciosbasico;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args){
        float salarioMinimo;
        float salarioUsuario;
        int quantidade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salário mínimo: ");
        salarioMinimo = entrada.nextFloat();
        System.out.println("Digite o valor do seu salário: ");
        salarioUsuario = entrada.nextFloat();

        quantidade = (int) (salarioUsuario / salarioMinimo);
        System.out.println("você ganha: " + quantidade + " salário mínimo");
    }
}
