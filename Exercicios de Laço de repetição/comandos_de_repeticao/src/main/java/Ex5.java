import java.util.Scanner;

//5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

public class Ex5 {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        int soma=0;
        int n=1;
        int numero;

        while(n<=10){
            System.out.println("Digite um número: ");
            numero = numeros.nextInt();
            soma = soma + numero;
            n++;
        }

        System.out.println(soma);

    }
}

