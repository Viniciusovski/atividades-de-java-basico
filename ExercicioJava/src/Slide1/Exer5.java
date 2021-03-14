/*
Escreva um algoritmo para ler o número de votos brancos, nulos e válidos. Calcular e escrever o
percentual que cada um representa em relação ao total de eleitores (supondo que todos de uma
determinada cidade votaram em alguma dessas opções).
*/

package Slide1;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de votos válidos, nulos e brancos");
        
        int valido = scan.nextInt();
        int nulo = scan.nextInt();
        int branco = scan.nextInt();
        
        
        int numeroVotos = valido + branco + nulo;
        
        int votosValidos = valido * 100;
        int porcentagemValidos = votosValidos / numeroVotos;
        
        int votosNulo = nulo * 100;
        int porcentagemNulos = votosNulo / numeroVotos;
        
        int votosBrancos = branco * 100;
        int porcentagemBrancos = votosBrancos / numeroVotos;
        
        System.out.println("Resultado das Eleções: \n" +
                "Porcentagem de Votos Válidos: " + porcentagemValidos + "%" + "\n" +
                "Porcentagem de Votos Nulos: " + porcentagemNulos + "%" + "\n" +
                "Porcentagem de Votos Brancos: " + porcentagemBrancos + "%");
    }
}
