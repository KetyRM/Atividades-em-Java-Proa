import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Escreva o nome de um número: ");

        String numero = dados.nextLine();

        int n = 1;

        while(n<=10){
            System.out.println(numero);
            n++;
        }

    }
}
