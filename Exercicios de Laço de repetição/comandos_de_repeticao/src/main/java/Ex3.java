import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner nome = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String seunome = nome.nextLine();

        int n=1;

        do{
            System.out.println(seunome);
            n++;
        }while(n<=10);

    }


}
