package slide2;

import java.util.Scanner;

public class Lampada {
    public static void main(String[] args) {
        System.out.println("Digite um sinal: ");
        Scanner scan = new Scanner(System.in);
        String sinal = "true";
        
        String resp = scan.nextLine();
        
        if("true".equals(resp)){
            System.out.println("Lampada acessa");
        }else{
            System.out.println("Lampada Apagada");
        }
        
    }
}
