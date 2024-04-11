import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maior = 0, numero = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o " + (i+1) + "º número:");
            numero = in.nextInt();
            if (numero > maior)
                maior = numero;
            numero = 0;
        }
        System.out.println("O maior número é o " + maior);
        in.close();
    }
}
