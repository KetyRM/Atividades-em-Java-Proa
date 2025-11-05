package listadeexercicios;

import java.util.Scanner;


public class Atividade6 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);


        int n1;
        int n2;
        int troca;

        System.out.println("Digite o primeiro número: ");
        n1 = num.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = num.nextInt();

        troca = n1;
        n1 = n2;
        n2 = troca;

        System.out.println("Números trocados:");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}
