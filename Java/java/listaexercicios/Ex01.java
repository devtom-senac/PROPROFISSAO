package listaexercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        int Prato, Sobremesa, Bebida;
        int CaloriaP = 0 ;
        int CaloriaS = 0;
        int CaloriaB = 0;
        int Caloria;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o prato: 1- Vegetariano, 2- Peixe, 3- Frango, 4- Carne ");
        Prato = entrada.nextInt();

         switch (Prato){
            case 1: CaloriaP += 180; break;
            case 2: CaloriaP += 230; break;
            case 3: CaloriaP += 250; break;
            case 4: CaloriaP += 350; break;
            default: System.out.println("Prato inválido");
        }
        System.out.println( "O prato escolhido possui: " + CaloriaP + " cal.");
        System.out.println("Escolha o Sobremesa: 1- Abacaxi, 2- Sorvete Diet, 3- Mouse Diet, 4- Mouse Chocolate ");

        Sobremesa = entrada.nextInt();
        switch (Sobremesa) {
            case 1: CaloriaS += 75; break;
            case 2: CaloriaS += 110; break;
            case 3: CaloriaS += 170; break;
            case 4: CaloriaS += 200; break;
            default: System.out.println("Sobremesa inválida");
        }

        System.out.println( "A sobremesa escolhida possui: " + CaloriaS + " cal.");
        System.out.println("Escolha o Bebida: 1- Chá, 2-Suco de Laranja, 3- Suco de Melão, 4- Refrigerante Diet ");
        Bebida = entrada.nextInt();        switch (Bebida){            case 1: CaloriaB += 20; break;
            case 2: CaloriaB += 70; break;
            case 3: CaloriaB += 100; break;
            case 4: CaloriaB += 65; break;
            default: System.out.println("Bebida inválida");
        }
        System.out.println( "A bebida escolhida possui: " + CaloriaB + " cal.");
        Caloria = CaloriaP + CaloriaS + CaloriaB;
        System.out.println("As calorias totais do seu pedido é: " + Caloria + "cal.");
    }
}
