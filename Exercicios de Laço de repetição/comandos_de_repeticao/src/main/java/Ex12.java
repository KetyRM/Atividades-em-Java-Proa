import java.util.Scanner;

//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares
public class Ex12 {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        int contagemnumeros =0;
        int n=1;

        do{
            System.out.println("Digite o numero: ");

            int numero = numeros.nextInt();

            if (numero % 2 == 0){
                contagemnumeros++;
            }
            n++;
        }while(n <= 20);
        System.out.println("Os números pares dentro dos 20 números são: " + contagemnumeros);
    }
}
