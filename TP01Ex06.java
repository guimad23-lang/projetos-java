/**
 * Exercício 6 - Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;

public class TP01Ex06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double soma = 0;
		for (int i = 1; i <= 4; i++){
			System.out.print("Digite o " + i + "º valor: ");
			double valor = leitor.nextDouble();
			soma += valor;
		} 
		System.out.println("A média aritmética dos valores é: " + soma/4);
	}
}