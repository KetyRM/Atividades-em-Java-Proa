package listadeexercicios2;

import java.util.Scanner;


public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = dados.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

    }
}
