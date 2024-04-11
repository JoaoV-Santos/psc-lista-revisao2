import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o preço do produto:");
        double preco = in.nextDouble();
        System.out.println("Informe o preço original do produto:");
        double precoOriginal = in.nextDouble();
        double desconto = preco * 100 / precoOriginal;
        desconto = 100 - desconto;
        System.out.printf("Desconto: %.2f", desconto);
        System.out.print("%");
        in.close();
    }
}
