/*
Ler 10 valores, calcular e escrever a média aritmética desses valores lidos.
 */
package Slide3;

import java.util.Scanner;

public class Exer6_DezValores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite 10 valores: ");
        int n1  = scan.nextInt();
        int n2  = scan.nextInt();
        int n3  = scan.nextInt();
        int n4  = scan.nextInt();
        int n5  = scan.nextInt();
        int n6  = scan.nextInt();
        int n7  = scan.nextInt();
        int n8  = scan.nextInt();
        int n9  = scan.nextInt();
        int n10  = scan.nextInt();
        
        int soma = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
        int media = soma / 10;
        
        System.out.println("A média dos numeros é " + media);
        
        int num = 0;
        
        for(int i = 1; i <=10; i++){
            System.out.println("Digite um valor: ");
            num += scan.nextInt();
        }
        
        int novaMedia = num / 10;
        System.out.println("O valor da media é " + novaMedia);
        
    }
}
