/**
 * Exercício 12 - Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base
 * que serão digitados.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;
	
public class TP01Ex12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double altura = 0;
		double raio = 0;
		boolean alturainvalida = true;
		do{
			System.out.print("Digite a altura do cone: ");
			altura = leitor.nextDouble();
			if (altura > 0) alturainvalida = false;
			else System.out.println("Altura inválida. Por favor, digite novamente.");
		} while (alturainvalida);
		boolean raioinvalido = true;
		do{
			System.out.print("Agora digite o raio do cone: ");
			raio = leitor.nextDouble();
			if (raio > 0) raioinvalido = false;
			else System.out.println("Raio inválido. Por favor, digite novamente.");
		} while (raioinvalido);
		System.out.printf("O volume do cone é de: %.2f%n", (Math.PI*Math.pow(raio, 2))*altura);
	}
}