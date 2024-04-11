import java.util.Random;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random sorteio = new Random();
        int jogadaMaquina = 0, jogada = 0;
        int contadorMaquina = 0, contadorJogador = 0;
        do {
            jogadaMaquina = sorteio.nextInt(1, 4);
            System.out.println("\nPlacar\nComputador " + contadorMaquina + " X " + contadorJogador + " Jogador");
            System.out.println("Escolha uma opção\n1.Pedra\n2.Papel\n3.Tesoura");
            jogada = in.nextInt();
            if (jogada != 1 && jogada != 2 && jogada != 3)
                System.out.println("Opção inválida!");

            if (jogada == jogadaMaquina)
                System.out.println("Empate");

            if (jogada == 1 && jogadaMaquina == 2) {
                System.out.println("\nPapel vence pedra.");
                contadorMaquina++;
            }
            else if (jogada == 1 && jogadaMaquina == 3) {
                contadorJogador++;
                System.out.println("\nPedra vence tesoura.");
            }
            if (jogada == 2 && jogadaMaquina == 3) {
                contadorMaquina++;
                System.out.println("\nTesoura vence papel.");
            }
            else if (jogada == 2 && jogadaMaquina == 1) {
                contadorJogador++;
                System.out.println("\nPapel vence pedra.");
            }
            if (jogada == 3 && jogadaMaquina == 1) {
                contadorMaquina++;
                System.out.println("\nPedra vence tesoura.");
            }
            else if (jogada == 3 && jogadaMaquina == 2) {
                contadorJogador++;
                System.out.println("\nTesoura vence papel.");
            }

        } while (contadorMaquina < 3 && contadorJogador < 3);

        System.out.println("\nPlacar\nComputador " + contadorMaquina + " X " + contadorJogador + " Jogador");
        if (contadorJogador == 3)
            System.out.println("\nVOCÊ VENCEU!");
        else if (contadorMaquina == 3)
            System.out.println("\nVOCÊ PERDEU!");

        in.close();
    }
}
