import java.util.Scanner;

//11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.
public class Ex11 {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        int contagemnumeros =0;
        int n=1;

        do{
            System.out.println("Digite o numero: ");

            int numero = numeros.nextInt();

            if (numero >8){
                contagemnumeros++;
            }
            n++;
        }while(n <= 20);
        System.out.println("Os números maiores que são maiores que 8 são:" + contagemnumeros);
    }

}

