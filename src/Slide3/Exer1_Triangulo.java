/*
Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do
retângulo.
*/
package Slide3;

import java.util.Scanner;

public class Exer1_Triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da base:");
        int base = scan.nextInt();
        System.out.println("Digite o valor da altura:");
        int altura = scan.nextInt();
        
        int area = (base * altura) / 2;
        
        System.out.println("O valor da area é: " + area);
    }
}
