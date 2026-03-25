/**
 * Exercício 8 - Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros
 * e que um quilômetro possui mil metros, fazer um programapara converter milhas marítimas em quilômetros.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;

public class TP01Ex08 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean distanciainvalida = true;
		double distancia = 0;
		do{
			System.out.print("Digite a  distância em milha marítima: ");
			distancia = leitor.nextDouble();
			if (distancia > 0) distanciainvalida = false;
			else System.out.println("Distância inválida. Por favor, digite novamente.");
		} while (distanciainvalida);
		System.out.printf("A distância em quilômetros é: %.2f%n", distancia*1.852);
	}
}