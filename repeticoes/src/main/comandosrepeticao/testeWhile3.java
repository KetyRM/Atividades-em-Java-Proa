import java.util.Scanner;

public class testeWhile3 {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        int pares=0;
        int impares =0;
        int n =1;

        while(n<=10){
            System.out.println("Digite um número: ");
            int numero = dado.nextInt();

            if(numero %2 ==0){
                pares++;
            }else{
                impares++;
            }
            n++;
        }

        System.out.println("Quantidade de número pares: " + pares);
        System.out.println("Quantidade de número impares: " + impares);


    }
}
