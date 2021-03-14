package slide2;

import java.util.Scanner;

public class SomarDoisNumeros {

    public static void main(String[] args) {
        System.out.println("Digite dois números: ");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        if (soma > 10 || soma == 6) {
            int divisao = soma / 2;
            System.out.println("O resultado da divisão: " + divisao);

        }else{
            System.out.println("O resultada da soma: "+ soma);
        }
    }
}
