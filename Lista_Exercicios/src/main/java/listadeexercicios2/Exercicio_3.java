package listadeexercicios2;
import java.util.Scanner;


public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite o saldo médio do último ano: ");
        double saldo = dados.nextDouble();
        double credito;

        if (saldo <= 500) {
            credito = 0;
        } else if (saldo <= 1000) {
            credito = saldo * 0.3;
        } else if (saldo  <= 3000) {
            credito = saldo * 0.4;
        } else {
            credito = saldo * 0.5;
        }

        System.out.printf("Saldo médio: R$ %.2f%n", saldo);
        System.out.printf("Crédito concedido: R$ %.2f%n", credito);
    }

}
