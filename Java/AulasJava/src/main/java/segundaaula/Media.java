package segundaaula;

import  java.util.Scanner;

public class Media {

    public static void main(String[] args){
        float n1, n2, n3 ,n4, media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        n1 = entrada.nextFloat();
        System.out.println("Entre com a segunda nota: ");
        n2 = entrada.nextFloat();
        System.out.println("Entre com a terceira nota: ");
        n3 = entrada.nextFloat();
        System.out.println("Entre com a quarta nota: ");
        n4 = entrada.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média das notas é: " + media);

        if(media >= 6) {
            System.out.println("Aluno aprovado");
        } else if(media >= 5){
            System.out.println("Aluno em recuperação");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }

}
