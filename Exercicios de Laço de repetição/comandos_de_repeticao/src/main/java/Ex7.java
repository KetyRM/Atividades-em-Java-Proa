import java.util.Scanner;

//7) Leia a idade de 20 pessoas e exiba a média das idades.

public class Ex7 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        int somaidades= 0;
        int n=1;

        for(n = 1; n <= 20; n++){
            System.out.println("Digite as idades: ");
            int idade = dados.nextInt();
            somaidades = somaidades + idade;
        }

        double media = somaidades / 20.00;  //Tanto int quanto double funcionam, vai depender se eu quero que apareça a casa decimal.
        System.out.println("A média das idades é: " + media);
    }

}
