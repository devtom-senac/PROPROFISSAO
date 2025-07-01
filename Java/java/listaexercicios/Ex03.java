package listaexercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex03 {
    public static void main(String[] args) {
        double saldoMedio;
        double valorCredito = 0.0;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o saldo médio do cliente no último ano: ");
        saldoMedio = entrada.nextDouble();

        if (saldoMedio > 3000.00) {
            valorCredito = saldoMedio * 0.50;
        }else if (saldoMedio > 1000.00) {
            valorCredito = saldoMedio * 0.40;
        } else if (saldoMedio > 500.00) {
            valorCredito = saldoMedio * 0.30;
        } else {
            valorCredito = 0.0;
        }

        System.out.println("Saldo Médio: R$ " + df.format(saldoMedio));
        System.out.println("Valor de Crédito: R$ " + df.format(valorCredito));
    }
}
