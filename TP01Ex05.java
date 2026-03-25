/**
 * Exercício 5 - Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;

public class TP01Ex05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean diametroinvalido = true;
		double diametro = 0;
		do{
			System.out.print("Digite o diâmetro da esfera: ");
			diametro = leitor.nextDouble();
			if (diametro > 0) diametroinvalido = false;
			else System.out.println("Diâmetro inválido. Por favor, digite novamente.");
		} while (diametroinvalido);
		double volume = (Math.PI*Math.pow(diametro, 3))/6;
		System.out.printf("O volume da esfera é: %.2f%n", volume);
	}
}