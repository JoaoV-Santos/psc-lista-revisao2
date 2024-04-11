import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Para ser aprovado, um aluno precisa tirar uma nota maior ou igual a 60 pontos.");
        System.out.println("Informe a nota do aluno:");
        double nota = in.nextDouble();
        System.out.println((nota >= 60) ? "Aluno Aprovado!" : "Aluno Reprovado!");
        in.close();
    }
}
