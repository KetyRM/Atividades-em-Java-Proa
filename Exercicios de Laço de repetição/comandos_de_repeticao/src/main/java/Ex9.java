import java.util.Scanner;

// 9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
public class Ex9 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        String nomenovo =  "";
        int idadenovo= 0;
        int info = 1;

        for(info =1; info<=10; info++){
            System.out.println("Digite o nome: " );
            String nome = dados.nextLine();

            System.out.println("Digite a idade da pessoa: " );
            int idade = dados.nextInt();
            dados.nextLine();

            if(info == 1){
                nomenovo = nome;
                idadenovo = idade;
            }else {
                if (idade<idadenovo){
                    idadenovo = idade;
                    nomenovo = nome;
                }
            }
        }

        System.out.println("Nome: " + nomenovo + "  Idade: " + idadenovo);

    }
}
