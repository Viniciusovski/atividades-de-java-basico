/*
Faça um algoritimo para imprimir a tabuada do valor inserido
 */
package Slide3;

import java.util.Scanner;

public class Exer7_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 10");
        int num = scan.nextInt();
        int tabuada = 0;
        
        for(int i = 1; i <= 10; i++){
            tabuada = num * i;
            System.out.println(tabuada);
        }
    }
}
