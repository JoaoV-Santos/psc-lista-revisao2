import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade = in.nextInt();
        System.out.println((idade >= 18) ? "Maior de idade" : "Menor de idade");
        in.close();
    }
}
