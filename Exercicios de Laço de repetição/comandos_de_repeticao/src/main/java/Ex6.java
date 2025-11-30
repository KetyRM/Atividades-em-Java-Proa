import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner idade = new Scanner(System.in);
        System.out.println("Digite sua idade");

        String idades= idade.nextLine();
        int n=1;

        do{
            System.out.println(idades);
            n++;
        }while(n<+20);
    }

}
