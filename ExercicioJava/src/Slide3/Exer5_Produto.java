/*
Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário.
Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a
pagar = total - desconto), sabendo-se que: - Se quantidade <= 5 o desconto será de 2% ; Se quantidade > 5 e
quantidade <=10 o desconto será de 3% ; Se quantidade > 10 o desconto será de 5%
 */
package Slide3;

import java.util.Scanner;

public class Exer5_Produto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double desconto = 0;
        System.out.println("Digite a descrição do produto");
        String nome = scan.nextLine();
        System.out.println("Digite a quantidade");
        double qtd = scan.nextDouble();
        System.out.println("Digite o preço unitário");
        double preco = scan.nextDouble();
        
        double total = qtd * preco;
        
        if(qtd <= 5){
            desconto = total * 0.02;
        }else if(qtd > 5 && qtd <= 10){
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }
        double totalPagar = total - desconto;
        System.out.println("O valor a pagar o produto " + nome + " é: " + totalPagar);
    }
}
