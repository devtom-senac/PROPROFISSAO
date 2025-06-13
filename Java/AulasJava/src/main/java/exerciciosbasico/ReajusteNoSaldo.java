package exerciciosbasico;

import java.util.Scanner;

public class ReajusteNoSaldo {
    public static void main(String[] args){
        float saldoAtual;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o saldo atual: ");
        saldoAtual = entrada.nextFloat();

        float novoSaldo = (float) (saldoAtual + (saldoAtual * 0.01));

        System.out.println("O saldo com reajuste de 1% é: " + "R$ " + novoSaldo);
    }

}
