package listadeexercicios2;
import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = dados.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = dados.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = dados.nextInt();

        int primeiro, segundo, terceiro;

        if (A >= B && A >= C) {
            primeiro = A;
            if (B >= C) {
                segundo = B;
                terceiro = C;
            } else {
                segundo = C;
                terceiro = B;
            }
        } else if (B >= A && B >= C) {
            primeiro = B;
            if (A >= C) {
                segundo = A;
                terceiro = C;
            } else {
                segundo = C;
                terceiro = A;
            }
        } else {
            primeiro = C;
            if (A >= B) {
                segundo = A;
                terceiro = B;
            } else {
                segundo = B;
                terceiro = A;
            }
        }

        System.out.printf("Ordem decrescente: %d, %d, %d%n", primeiro, segundo, terceiro);

    }

}
