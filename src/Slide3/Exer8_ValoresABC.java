/*
Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um
triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
 */
package Slide3;

import java.util.Scanner;

public class Exer8_ValoresABC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite os lados do triangulo: ");
        int ladoA = scan.nextInt();
        int ladoB = scan.nextInt();
        int ladoC = scan.nextInt();
        
        int soma1 = ladoA + ladoB;
        int soma2 = ladoB + ladoC;
        int soma3 = ladoA + ladoC;
        
        if((ladoC < soma1) && (ladoA < soma2) && (ladoB < soma3)){
            System.out.println("É um Triângulo");
        }else{
            System.out.println("Não é um Triângulo");
        }
    }
}
