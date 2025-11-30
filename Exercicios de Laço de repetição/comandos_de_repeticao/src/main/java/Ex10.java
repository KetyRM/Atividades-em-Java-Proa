import java.util.Scanner;

public class Ex10 {
        public static void main(String[] args) {

            Scanner dado = new Scanner(System.in);

            System.out.println("Digite o número da tabuada que você quer ver: ");

            int tabuada = dado.nextInt();

            int n = 1;

            while(n<=10){
                int resultado = tabuada * n;
                System.out.println(tabuada + "X" + n + "=" + resultado);
                n++;
            }

        }

}

