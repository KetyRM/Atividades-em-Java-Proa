package listadeexercicios;

import java.util.Scanner;


public class Atividade7 {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        float deposito;
        float juros;

        System.out.print("Digite o valor do depósito mensal: ");
        deposito = dados.nextFloat();

        System.out.print("Digite a taxa de juros mensal: ");
        juros = dados.nextFloat();

        juros = juros / 100;

        float montante = 0;

        for (int i = 1; i <= 12; i++) {
            montante += deposito;
            montante += montante * juros;
        }


        System.out.printf("O montante após 12 meses será: R$ %.2f", montante);


    }

}
