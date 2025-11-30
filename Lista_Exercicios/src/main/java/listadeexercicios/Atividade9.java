package listadeexercicios;

import java.util.Scanner;



public class Atividade9 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int anos;

        System.out.print("Digite a sua idade: ");
        anos = dados.nextInt();

        int meses = anos * 12;
        int dias = anos * 365;

        int totalDias = anos * 365 + meses * 30 + dias;

        System.out.println("Você tem aproximadamente:");
        System.out.println(anos + " anos");
        System.out.println(meses + " meses");
        System.out.println(dias + " dias");
        System.out.println("Você viveu " + totalDias + " dias de vida.");


    }
}
