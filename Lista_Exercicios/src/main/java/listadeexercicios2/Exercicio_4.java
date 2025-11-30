package listadeexercicios2;
import java.util.Scanner;


public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = dados.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar");
        } else if ((idade >= 16 && idade < 18) || idade >= 65) {
            System.out.println("Seu voto é facultativo.");
        } else {
            System.out.println("Seu voto é obrigatório.");
        }


    }
}
