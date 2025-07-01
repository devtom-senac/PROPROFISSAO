package terceiraaula;

import java.util.Scanner;

public class TreinoSwitch {
    public static void main(String[] args) {
        int numEquipe;
        String professor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número da equipe: ");
        numEquipe = entrada.nextInt();

        switch (numEquipe){
            case 1:
                professor = "Débora Paixão";
                break;
            case 2:
                professor = "Gabriel";
                break;
            case 3:
                professor = "Jailson";
                break;
            default: professor = "Número da equipe inválido";
        }

        System.out.println("equipe: " + numEquipe + " professor: " + professor);
    }
}
