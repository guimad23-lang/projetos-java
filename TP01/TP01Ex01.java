/**
 * Exercício 1 - Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;

public class TP01Ex01 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double base = 0;
		double altura = 0;
		boolean baseinvalida = true;
		do{
			System.out.print("Digite a base do retângulo: ");
			base = leitor.nextDouble();
			if (base > 0) baseinvalida = false;
			else System.out.println("Base inválida. Por favor, digite novamente.");
		} while (baseinvalida);
		boolean alturainvalida = true;
		do{
			System.out.print("Agora digite a altura do retângulo: ");
			altura = leitor.nextDouble();
			if (altura > 0) alturainvalida = false;
			else System.out.println("Altura inválida. Por favor, digite novamente.");
		} while (alturainvalida);
		System.out.println("A área do retângulo é: " + base*altura);
	}
}
