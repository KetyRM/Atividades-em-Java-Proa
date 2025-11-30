package listadeexercicios2;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = dados.nextInt();

        String dia;

        switch (numero) {
            case 1: dia = "Domingo"; break;
            case 2: dia = "Segunda-feira"; break;
            case 3: dia = "Terça-feira"; break;
            case 4: dia = "Quarta-feira"; break;
            case 5: dia = "Quinta-feira"; break;
            case 6: dia = "Sexta-feira"; break;
            case 7: dia = "Sábado"; break;
            default: dia = "Número inválido! Não existe dia da semana com esse número.";
        }

        System.out.println("O número escolhido representa o dia : " + dia);

    }
}
