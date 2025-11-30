import java.util.Scanner;

public class TesteFor3 {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for(int n = 1; n <= 10; n++) {

            System.out.println("Digite um número: ");
            int numero = dado.nextInt();

            if(numero % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

    }
}

