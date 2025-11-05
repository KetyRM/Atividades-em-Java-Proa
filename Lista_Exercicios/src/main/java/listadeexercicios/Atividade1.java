package listadeexercicios;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        int n1;
        int n2;
        Scanner numeros= new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        n1 = numeros.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2 = numeros.nextInt();


        int soma = n1 + n2;
        int divisao = n1 / n2;
        int multiplicacao = n1 * n2;
        int subtracao = n1 - n2;

        System.out.println("A soma é " + soma);
        System.out.println("A divisão é " + divisao);
        System.out.println("A multiplicação é " + multiplicacao);
        System.out.println("A subtração é " + subtracao);

    }
}



