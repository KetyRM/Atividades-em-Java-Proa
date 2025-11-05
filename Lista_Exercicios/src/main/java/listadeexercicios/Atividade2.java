package listadeexercicios;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        float raio = dados.nextFloat();

        float area = (float) (Math.PI * raio * raio);
        float perimetro = (float) (2 * Math.PI * raio);

        System.out.printf("A área do círculo é: %.2f%n", area);
        System.out.printf("O perímetro do círculo é: %.2f%n", perimetro);



    }
}
