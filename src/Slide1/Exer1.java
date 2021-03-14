//Crie um algoritmo que leia um número diferente de zero e diga se este número é positivo ou negativo.
package Slide1;

import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            
            if(numero ==  0){
                System.out.println("O número deve ser diferente de 0");
            }else if(numero < 0){
                System.out.println("O número é negativo");
            }else{
                System.out.println("O número é positivo");
            }
            
        }while(numero == 0);
        
    }
}
