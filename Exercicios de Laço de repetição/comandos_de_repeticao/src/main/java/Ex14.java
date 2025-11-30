import java.util.Scanner;

//14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100,
// quantos estão entre 101 e 200 e quantos são maiores de 200.

public class Ex14 {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        int contagemnumeros = 0;
        int contagemdois = 0;
        int contagemtres = 0;

        int n = 1;

        while (n <= 20) {
            System.out.print("Digite o número: ");
            int numero = numeros.nextInt();

            if (numero >= 0 && numero <= 100) {
                contagemnumeros++;
            } else if (numero >= 101 && numero <= 200) {
                contagemdois++;
            } else if (numero > 200) {
                contagemtres++;
            }

            n++;
        }

        System.out.println("Números entre 0 e 100: " + contagemnumeros);
        System.out.println("Números entre 101 e 200: " + contagemdois);
        System.out.println("Números maiores que 200: " + contagemtres);
    }
}
