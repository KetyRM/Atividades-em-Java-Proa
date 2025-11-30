package listadeexercicios2;

import java.util.Scanner;


public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int prato = 0, sobremesa = 0, bebida = 0;
        int calPrato = 0, calSobremesa = 0, calBebida = 0;

        System.out.println("Escolha o prato:");
        System.out.println("1 - Vegetariano (180 cal)");
        System.out.println("2 - Peixe (230 cal)");
        System.out.println("3 - Frango (250 cal)");
        System.out.println("4 - Carne (350 cal)");
        prato = dados.nextInt();

        switch (prato) {
            case 1: calPrato = 180; break;
            case 2: calPrato = 230; break;
            case 3: calPrato = 250; break;
            case 4: calPrato = 350; break;
            default: System.out.println("Prato inválido!");
        }

        System.out.println("Escolha a sobremesa:");
        System.out.println("1 - Abacaxi (75 cal)");
        System.out.println("2 - Sorvete diet (110 cal)");
        System.out.println("3 - Mouse diet (170 cal)");
        System.out.println("4 - Mouse chocolate (200 cal)");
        sobremesa = dados.nextInt();

        switch (sobremesa) {
            case 1: calSobremesa = 75; break;
            case 2: calSobremesa = 110; break;
            case 3: calSobremesa = 170; break;
            case 4: calSobremesa = 200; break;
            default: System.out.println("Sobremesa inválida!");
        }

        System.out.println("Escolha a bebida:");
        System.out.println("1 - Chá (20 cal)");
        System.out.println("2 - Suco de laranja (70 cal)");
        System.out.println("3 - Suco de melão (100 cal)");
        System.out.println("4 - Refrigerante diet (65 cal)");
        bebida = dados.nextInt();

        switch (bebida) {
            case 1: calBebida = 20; break;
            case 2: calBebida = 70; break;
            case 3: calBebida = 100; break;
            case 4: calBebida = 65; break;
            default: System.out.println("Bebida inválida!");
        }

        int total = calPrato + calSobremesa + calBebida;

        System.out.println("O total de calorias da refeição é: " + total + " cal");

    }

}
