/*Exercício ralizado considerando as taxas descritas em https://agenciabrasil.ebc.com.br/economia/noticia/2024-02/entenda-nova-tabela-progressiva-do-imposto-de-renda*/

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calculadora imposto de renda sobre o salário.");
        System.out.println("\nInforme o valor do seu salário: ");
        double salario = in.nextDouble();
        double imposto = 0;
        if (salario <= 2259.20)
            System.out.println("Isento de imposto de renda.");
        else if ( salario > 2259.20 && salario <= 2826.65) {
            imposto = 0.075;
            System.out.println("Valor imposto de renda: R$ " + (salario * imposto));
        }
        else if ( salario > 2826.65 && salario <= 3751.05) {
            imposto = 0.15;
            System.out.println("Valor imposto de renda: R$ " + (salario * imposto));
        }
        else if ( salario > 3571.05 && salario <= 4664.68) {
            imposto = 0.225;
            System.out.println("Valor imposto de renda: R$ " + (salario * imposto));
        }
        else if ( salario > 4664.68) {
            imposto = 0.275;
            System.out.println("Valor imposto de renda: R$ " + (salario * imposto));
        }


        in.close();
    }
}
