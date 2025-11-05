package listadeexercicios;

import java.util.Scanner;


public class Atividade5 {

    public static void main(String[] args) {

        float base;

        Scanner entrada= new Scanner(System.in);

        System.out.println("Digite o salário base: ");
        base = entrada.nextFloat();



        float liquido = base + ( base * 0.05f);

        System.out.printf("O salário líquido é: %.2f", liquido);


    }



}
