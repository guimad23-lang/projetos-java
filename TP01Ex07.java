/**
 * Exercício 7 - Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;

public class TP01Ex07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean valorinvalido = true;
		double valor1 = 0;
		double valor2 = 0;
		do{
			System.out.print("Digite o primeiro valor (positivo): ");
			valor1 = leitor.nextDouble();
			if (valor1 > 0) valorinvalido = false;
			else System.out.println("Valor inválido. Por favor, digite novamente.");
		} while (valorinvalido);
		valorinvalido = true;
		do{
			System.out.print("Digite o segundo valor (positivo): ");
			valor2 = leitor.nextDouble();
			if (valor2 > 0) valorinvalido = false;
			else System.out.println("Segundo valor inválido. Por favor, digite novamente.");
		} while (valorinvalido);
		System.out.printf("A média geométrica dos valores é: %.2f%n", Math.sqrt(valor1*valor2));
	}
}