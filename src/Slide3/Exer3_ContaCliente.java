/*
Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o
saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero
escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. 
 */
package Slide3;

import java.util.Scanner;

public class Exer3_ContaCliente {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        int conta = scan.nextInt();
        System.out.println("Digite o saldo");
        double saldo = scan.nextDouble();
        System.out.println("Digite o valor do débito");
        double debito = scan.nextDouble();
        System.out.println("Digite o valor do crédito");
        double credito = scan.nextDouble();

        double saldoAtual = (saldo - debito) + credito;

        if (saldoAtual < 0) {
            System.out.println("Saldo Negativo");
        } else {
            System.out.println("Saldo Positivo");
        }
        System.out.println("O saldo da conta " + conta + " é R$" + saldoAtual);
    }
}
