package slide2;

import java.util.Scanner;

public class NotaDoAluno {

    public static void main(String[] args) {
        float nota = 0;
        float faltas = 0;
        String resp = "";
        String negado = "Digite valores válidos para a nota (0 a 10) e faltas (0 ou positivos";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite a sua nota: ");
            nota = scan.nextFloat();
            System.out.println("Digite o número de faltas: ");
            faltas = scan.nextFloat();

            if (nota < 6 && faltas > 9) {
                resp = "REPROVADO";
                System.out.println(resp);
            } else if ((nota <= 6 || nota < 8) && !(faltas > 10)) {
                resp = "APROVADO, mas com restrição";
                System.out.println(resp);
            } else if ((nota >= 8 || nota < 10) && faltas < 15) {
                resp = "APROVADO";
                System.out.println(resp);
            } else if (nota == 10) {
                resp = "APROVADO COM MÉRITO";
                System.out.println(resp);
            } else if ((nota >= 0 && nota <= 10) || !(faltas >= 0)) {
                resp = "Aluno Reprovado por faltas";
                System.out.println(resp);
            } else {
                System.out.println(resp = negado);
            }

        } 
        while (resp.equals(negado));
    }

}
