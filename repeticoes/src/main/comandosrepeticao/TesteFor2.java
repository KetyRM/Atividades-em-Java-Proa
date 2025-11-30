package comandosrepeticao;
import java.util.*;

public class TesteFor2 {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        System.out.println("Digite o número da tabuada que você quer ver: ");

        int tabuada = dado.nextInt();

        for(int n = 1; n<=10; n++){
            int resultado = tabuada * n;
            System.out.println(tabuada + "X" + n + "=" + resultado);
        }

    }
}
