import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número:");
        int n = in.nextInt();
        System.out.println((n % 2 == 0) ? "Par" : "Ímpar");
        in.close();
    }
}
