package listadeexercicios;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        float base;
        float altura;

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        base = dados.nextInt();

        System.out.println("Digite o vslor da altura: ");
        altura = dados.nextInt();

        float area = (base * altura) / 2;

        System.out.printf("A área do triângulo é: %.2f", area);


    }


}
