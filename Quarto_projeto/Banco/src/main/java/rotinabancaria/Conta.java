package rotinabancaria;

import java.util.Scanner;
import java.util.Random;

public class Conta {

    int numero_conta;
    String titular_conta;
    double saldo;

    Scanner dado= new Scanner(System.in);

    public Conta(String nome_titular, double saldo_inicial){
        this.titular_conta =  nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();
        this.numero_conta = gerador_numero.nextInt(1000);
    }

    public void VerSaldo(){
        System.out.println("O numero da conta é: " + numero_conta);
        System.out.println("O título da conta é: " + titular_conta);
        System.out.println("O saldo atual é: " + saldo);
    }

    public void Saque(double valor_saque){
        if(saldo >= valor_saque){
            saldo = saldo - valor_saque;
            System.out.println("O saldo atual é: " + saldo);
        }else{
            System.out.println("Saldo é insuficiente");
        }
    }


    public void Deposito(double valor_deposito){
        if(valor_deposito <=0){
            System.out.println("O valor de depósito inválido!");
        }else{
            saldo = saldo + valor_deposito;
            System.out.println("O saldo atual é: " + saldo);
        }

    }

    public void Emprestimo(double valor_emprestimo){
        if(saldo >=5000){
            saldo += valor_emprestimo;
            System.out.println("Imprestimo aprovado");
            System.out.println("Seu novo saldo é: " + saldo);
        }else{
            System.out.println("Saldo insuficiente para o imprestimo!Junte mais dinheiro");
        }
    }

    public void Cartaocredito (double valor_cartaocredito){
        if(saldo >=2500){
            System.out.println("Cartão de credito aprovado!");
            System.out.println("O limite no cartão de crédito é:" + valor_cartaocredito);
            System.out.println("Seu saldo atual continua sendo: " + saldo);
        }else {
            System.out.println("Seu saldo não é suficiente para ter um cartão de crédito!");
        }
    }


    public void Iniciar(){
        int opcao;
        do{
            Exibir_menu();
            opcao = dado.nextInt();
            Escolher_funcao(opcao);
        }while (opcao !=4);
    }

    public void Exibir_menu(){
        System.out.println("Bem-vindos ao Itaú!");
        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Finalizar");
        System.out.println("5 - Emprestimo");
        System.out.println("6 - Cartão de crédito");
    }

    public void Escolher_funcao(int opcao){
        double saque;
        double deposito;
        double emprestimo;
        double cartaocredito;

        switch (opcao){
            case 1: VerSaldo();
            break;
            case 2:
                System.out.println("Digite o valor a ser sacado:");
                saque = dado.nextDouble();
                Saque(saque);
                break;
            case 3:
                System.out.println("Digite o valor a ser depositado!:");
                deposito = dado.nextDouble();
                Deposito(deposito);
                break;
            case 4:
                System.out.println("Operação finalizada. Obrigada");
                break;
            case 5:
                System.out.println("Digite o valor do emprestimo");
                emprestimo = dado.nextDouble();
                Emprestimo(emprestimo);
                break;
            case 6:
                System.out.println("Digite o valor do cartão de credito");
                cartaocredito = dado.nextDouble();
                Cartaocredito(cartaocredito);
                break;

            default:
                System.out.println("Opção inválida!");
        }

    }
}
