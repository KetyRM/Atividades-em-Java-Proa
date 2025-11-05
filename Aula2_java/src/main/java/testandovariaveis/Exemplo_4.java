package testandovariaveis;

import java.util.Scanner;

public class Exemplo_4 {

    public static void main(String[] args) {

        float altura;
        float peso;

        Scanner dados= new Scanner(System.in);

        System.out.println("Digite a altura: ");
        altura = dados.nextFloat();

        System.out.println("Digite o peso: ");
        peso = dados.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f", imc);

    }
}
