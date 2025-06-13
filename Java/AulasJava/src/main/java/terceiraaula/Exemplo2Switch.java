package terceiraaula;

import java.util.Scanner;

public class Exemplo2Switch {
    public static void main(String[] args) {
        int NumMes;
        String NomeMes;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o número do mes: ");
        NumMes = entrada.nextInt();

        switch (NumMes) {
            case 1:
                NomeMes = "Janeiro";
                break;
            case 2:
                NomeMes = "Fevereiro";
                break;
            case 3:
                NomeMes = "Março";
                break;
            case 4:
                NomeMes = "Abril";
                break;
            case 5:
                NomeMes = "Maio";
                break;
            case 6:
                NomeMes = "Junho";
                break;
            case 7:
                NomeMes= "Julho";
                break;
            case 8:
                NomeMes= "Agosto";
                break;
            case 9:
                NomeMes= "Setembro";
                break;
            case 10:
                NomeMes= "Outubro";
                break;
            case 11:
                NomeMes= "NovembroDezembro";
                break;
            case 12:
                NomeMes= "Dezembro";
                break;
            default:
                NomeMes = "Mês inválido";
        }

        System.out.println("O mês escolhido foi: " + NomeMes);
    }
}
