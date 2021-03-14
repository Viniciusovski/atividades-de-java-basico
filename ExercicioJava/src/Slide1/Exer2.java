//Crie um algoritmo que receba 3 números e informe qual o maior entre eles
package Slide1;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 3 números");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();
        
        if((numero1 >= numero2) && (numero1 >= numero3)){
            System.out.println("O "+numero1+ " é maior");
        }else if((numero2 >= numero3) && (numero2 >= numero1)){
            System.out.println("O "+numero2+ " é maior");
        }else{
            System.out.println("O "+numero3+ " é maior");
        }       
    }
}
