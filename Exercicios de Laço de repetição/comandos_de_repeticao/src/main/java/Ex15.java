import java.util.Scanner;

//15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a
//soma desses números. Encerre a execução quando um número negativo for digitado.

public class Ex15 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        int soma = 0;

        while (true) {
            System.out.print("Digite um número (negativo para parar): ");
            int numero = numeros.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);

    }
}
