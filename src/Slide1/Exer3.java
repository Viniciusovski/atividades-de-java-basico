//Leia dois valores inteiros e apresente a diferença do maior pelo menor.
package Slide1;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite dois números");
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        
        int resultado = valor1 - valor2;
        
        if(resultado == 0){
            System.out.println("Não existe diferença entre os números");
        }else if(resultado < 0){
            int positivo = resultado * (-1);
            System.out.println("A diferença dos números é " + positivo);
        } else{
           System.out.println("A diferença dos números é " + resultado);
        }
    }
}
