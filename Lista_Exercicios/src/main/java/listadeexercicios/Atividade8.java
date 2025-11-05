package listadeexercicios;

import java.util.Scanner;


public class Atividade8 {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Digite o número para exibir a tabuada: ");
        int numero = dados.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
