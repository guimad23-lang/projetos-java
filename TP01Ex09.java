/**
 * Exercício 9 - Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da
 * resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;

public class TP01Ex09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean resistenciainvalida = true;
		double resistencia = 0;
		do{
			System.out.print("Digite o valor da resistência em ohms: ");
			resistencia = leitor.nextDouble();
			if (resistencia > 0) resistenciainvalida = false;
			else System.out.println("Resistência inválida. Por favor, digite novamente.");
		} while (resistenciainvalida);
		System.out.println("Agora digite o valor da corrente em amperes: ");
		double corrente = leitor.nextDouble();
		System.out.println("A tensão é de: " + resistencia*corrente + " volts.");
	}
}