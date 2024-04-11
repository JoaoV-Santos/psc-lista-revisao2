import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = in.nextLine();
        String palindromo = new StringBuilder(palavra).reverse().toString();
        if (palindromo.equals(palavra))
            System.out.println("É um palíndromo!");
        else
            System.out.println("Não é um palíndromo!");

        in.close();
    }
}
