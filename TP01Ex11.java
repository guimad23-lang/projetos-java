/**
 * Exercício 11 - A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;

public class TP01Ex11 {
    	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean diametroinvalido = true;
		double diametro = 0;
		do{
			System.out.print("Digite o diâmetro do círculo: ");
			diametro = leitor.nextDouble();
			if (diametro > 0) diametroinvalido = false;
			else System.out.println("Diâmetro inválido. Por favor, digite novamente.");
		} while (diametroinvalido);
		System.out.printf("A área do círculo é de: %.2f%n", Math.pow((diametro/2), 2)*Math.PI);
	}
}