package listadeexercicios;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        float nota1;
        float nota2;
        float nota3;
        Scanner entrada= new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextFloat();

        float peso1 = 2;
        float peso2 = 3;
        float peso3 = 5;

        float mediaponderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("A média das três notas é: %.2f", mediaponderada);


    }


}
