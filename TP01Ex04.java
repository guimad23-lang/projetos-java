/**
 * Exercício 4 - A partir dos valores de base e altura de um triângulo, calcular e exibir sua área.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;

public class TP01Ex04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double base = 0;
		double altura = 0;
		boolean baseinvalida = true;
		do{
			System.out.print("Digite a base do triângulo: ");
			base = leitor.nextDouble();
			if (base > 0) baseinvalida = false;
			else System.out.println("Base inválida. Por favor, digite novamente.");
		} while (baseinvalida);
		boolean alturainvalida = true;
		do{
			System.out.print("Agora digite a altura do triângulo: ");
			altura = leitor.nextDouble();
			if (altura > 0) alturainvalida = false;
			else System.out.println("Altura inválida. Por favor, digite novamente.");
		} while (alturainvalida);
		System.out.println("A área do triângulo é: " + (base*altura)/2);
	}
}