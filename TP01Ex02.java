/**
 * Exercício 2 - Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;

public class TP01Ex02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean arestainvalida = true;
		double aresta = 0;
		do{
			System.out.print("Digite a aresta do quadrado: ");
			aresta = leitor.nextDouble();
			if (aresta > 0) arestainvalida = false;
			else System.out.println("Aresta inválida. Por favor, digite novamente.");
		} while (arestainvalida);
		System.out.println("A área do quadrado é: " + Math.pow(aresta, 2));
	}
}