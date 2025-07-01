package terceiraaula;

import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {
        int DiaSemana;
        String NomeDia;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o número do dia da semana: ");
        DiaSemana = entrada.nextInt();

        switch (DiaSemana) {
            case 1:
                NomeDia = "Domingo";
                break;
            case 2:
                NomeDia = "Segunda-feira";
                break;
            case 3:
                NomeDia = "Terça-feira";
                break;
            case 4:
                NomeDia = "Quarta-feira";
                break;
            case 5:
                NomeDia = "Quinta-feira";
                break;
            case 6:
                NomeDia = "Sexta-feira";
                break;
            case 7:
                NomeDia = "Sábado";
                break;
            default:
                NomeDia = "Dia inválido";
        }

        System.out.println("O dia escolhido foi" + NomeDia);
    }
}
