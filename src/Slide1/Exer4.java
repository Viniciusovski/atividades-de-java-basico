/*
Crie um algoritmo que recebe 2 números e multiplica o num1 pelo num2 através de somas repetidas.
(ex: 2 e 3 = 2 + 2 + 2)
 */
package Slide1;

import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite dois números:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = 0;
        
        for(int posicao = 1; posicao <= num2; posicao++){
            soma += num1;                       
        }
        System.out.println(soma);
    }

}
