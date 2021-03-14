package slide2;

import java.util.Scanner;

public class MaiorQue10EPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        
        if((numero > 10) && (numero%2==0)){
            System.out.println("O número é maior que 10 e par");
        }else{
            System.out.println("O número NÃO é maior que 10 ou par");
        }
    }
}
