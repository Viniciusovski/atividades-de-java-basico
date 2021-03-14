/*Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.*/

package Slide3;

import java.util.Scanner;

public class Exer4_SomaDoisMaiores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite 3 valores");
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();
        int soma = 0;
        
        if((valor1 > valor2) && (valor3 > valor2)){
            soma = valor1 + valor3;
        }else if((valor2 > valor3) && (valor1 > valor3)){
            soma = valor2 + valor1;
        }else{
            soma = valor2 + valor3;
        }
        System.out.println("O valor da soma dos numeros maiores é "+soma);
    }
}
