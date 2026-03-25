/**
 * Exercício 3 - Calcular e exibir a área de um quadrado, a partir do valor de sua diagonal que será digitado.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;

public class TP01Ex03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean diagonalinvalida = true;
		double diagonal = 0;
		do{
			System.out.print("Digite a diagonal do quadrado: ");
			diagonal = leitor.nextDouble();
			if (diagonal > 0) diagonalinvalida = false;
			else System.out.println("Diagonal inválida. Por favor, digite novamente.");
		} while (diagonalinvalida);
		System.out.printf("A área do quadrado é: %.2f%n", (Math.pow(diagonal, 2))/2);
	}
}