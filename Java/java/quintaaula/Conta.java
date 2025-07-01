package quintaaula;
import java.util.Scanner;
import java.util.Random;


public class Conta {

    int numero_conta;
    String titular_conta;
    double saldo;
    double valor_deposito;
    double valor_emprestimo;

    Scanner entrada = new Scanner(System.in);

    public Conta(String nome_titular, double saldo_atual){
        this.titular_conta = nome_titular;
        this.saldo = saldo_atual;

        Random gerador_numero = new Random(); // gerador randomico de número
        numero_conta = gerador_numero.nextInt(1000);
    }

    public void VerSaldo(){
        System.out.println("Conta: " + numero_conta + "\nTitular: " + titular_conta + "\nSaldo: " + saldo);
    }

    public void Saque(double valor_saque){
        if(saldo >= valor_saque){
            saldo = saldo - valor_saque;
            System.out.println("Saldo atual: " + saldo);
        } else{
            System.out.println("Seu saldo é insuficiente");
        }
    }

    public void Deposito(double valor_deposito){
        if(valor_deposito <= 0){
            System.out.println("Depósito inválido, o valor é menor que 0");
        } else{
            saldo = saldo + valor_deposito;
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }

    public void Emprestimo(double valor_emprestimo){
        if(saldo > 100){
            System.out.println("Você não pode realizar um emprestimo.");
        } else if (valor_emprestimo > 1000) {
                System.out.println("O limite para empréstimo é de R$ 1000");
        } else {
            saldo = saldo + valor_emprestimo;
            System.out.println("XUXU! Empréstimo realizado com sucesso😎💸 \nValor solicitado: R$ " + valor_emprestimo);
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }

    public void Exibir_menu(){
        System.out.println("Bem vindo ao Banco do Proa");
        System.out.println("Escolha a sua opção");
        System.out.println("1- Ver saldo");
        System.out.println("2- Sacar");
        System.out.println("3- Depositar");
        System.out.println("4- Empréstimo");
        System.out.println("5- Finalizar");
    }

    public void Escolher_funcao(int opcao){
        double saque;
        double deposito;
        double emprestimo;

        switch (opcao) {
            case 1:
                VerSaldo();
                break;

            case 2:
                System.out.print("Digite o valor a ser sacado: R$ ");
                saque = entrada.nextDouble();
                Saque(saque);
                break;

            case 3:
                System.out.print("Digite o valor do deposito: R$ ");
                deposito = entrada.nextDouble();
                Deposito(deposito);
                break;

            case 4:
                System.out.print("Digite o valor do empréstimo: R$ ");
                emprestimo = entrada.nextDouble();
                Emprestimo(emprestimo);
                break;

            case 5:
                System.out.println("Operação finalizada, tmj proano");
                break;

            default:
                System.out.println("Opção inválida");
        }
    }

    public void Iniciar() {
        int opcao;
        do {
            Exibir_menu();
            opcao = entrada.nextInt();
            Escolher_funcao(opcao);
        } while (opcao != 5);
    }
}