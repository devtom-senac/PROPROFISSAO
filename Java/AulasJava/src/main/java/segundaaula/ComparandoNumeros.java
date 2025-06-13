package segundaaula;

import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args){

        int n1, n2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Entre com o segundo número: ");
        n2 = entrada.nextInt();

        if(n1 > n2) {
            System.out.println("O número: " + n1 + "é maior que: " + n2);
        } else if(n1 < n2){
            System.out.println("O número:" + n1 + " é maior que: " + n2);
        } else{
            System.out.println("Os números são iguais");
        }
    }
}
