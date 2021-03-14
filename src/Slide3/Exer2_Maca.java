/*
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo
menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da
compra.
*/
package Slide3;

import java.util.Scanner;

public class Exer2_Maca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o número de maçãs compradas:");
        float numMacas = scan.nextFloat();
        float preco = 0;
        
        if(numMacas < 12){
            preco = numMacas * 1.30f;            
        }else{
            preco = numMacas * 1;
        }
        
        System.out.println("O custo da compra é " + preco);
    }
}
