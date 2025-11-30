package testandovariaveis;

import java.util.Scanner;

public class Exemplo_4 {

    public static void main(String[] args) {

        float altura;
        float peso;

        Scanner dados= new Scanner(System.in);

        System.out.println("Digite a altura: ");
        altura = dados.nextFloat();

        System.out.println("Digite o peso: ");
        peso = dados.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f", imc);

        if (imc < 18.5){
            System.out.println("Você está abaixo do peso");
        }else if((imc >=18.6) && (imc<=24.9)){
            System.out.println("Você está no peso ideal");
        }else if((imc >=25) && (imc <=29.9)){
            System.out.println("Você está acima do peso");
        }else if(( imc >=30)  && (imc <=34.9)){
            System.out.println("Você esta com Obesidade grau I");
        }else if ((imc >=35) && (imc <=39.9)){
            System.out.println("Você está com Obesidade grau II");
        }else{
            System.out.println("Você está na obesidade morbida");
        }

    }
}
