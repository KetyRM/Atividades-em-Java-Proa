import java.util.Scanner;


//8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
public class Ex8 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int maioresdeidade=0;
        int n=1;

        for(n = 1; n <= 20; n++){
            System.out.println("Digite as idades: ");
            int idade = entrada.nextInt();

            if( idade >=18){
                maioresdeidade++;
            }
        }

        System.out.println("A quantidade de pessoas maiores de idade são: " + maioresdeidade);

    }
}

