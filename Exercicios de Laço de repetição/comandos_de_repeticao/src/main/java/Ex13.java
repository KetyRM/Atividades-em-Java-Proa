import java.util.Scanner;


//13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
public class Ex13 {
    public static void main(String[] args) {

        public static void main(String[] args) {

            Scanner numeros = new Scanner(System.in);

            int contagemnumeros = 0;
            int n = 1;

            while (n  <= 20){
                System.out.println("Digite o numero: ");

                int numero = numeros.nextInt();

                if (numero >= 0 && numero <= 100) {
                    contagemnumeros++;
                }
                n++;
            }

            System.out.println("Numeros entre 0 a 100: " + contagemnumeros);

    }
}
