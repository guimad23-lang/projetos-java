/**
 * Exercício 17 - Entrar via teclado com dois valores quaisquer "X" e "Y". Calcular e exibir o 
 * cálculo XY("X" elevado a "Y"). Pesquisar as funções Exp e Ln.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;

public class TP01Ex17 {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = leitor.nextDouble();
        System.out.print("Agora digite o valor de Y: ");
        double y = leitor.nextDouble();

        System.out.printf("O resultado de X elevado a Y é: %.2f%n", Math.pow(x, y));
    }
}