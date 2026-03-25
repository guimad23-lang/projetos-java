/**
 * Exercício 14 - Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio "r" inscrita em
 * um cubo perfeito de aresta "a". Os valores de "r" e "a" serão digitados.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;

public class TP01Ex14 {
    	public static void main(String[] args) {
        	Scanner leitor = new Scanner(System.in);
		double r = 0;
		double a = 0;
		boolean raioinvalido = true;
		do{
			System.out.print("Digite o raio da esfera: ");
			r = leitor.nextDouble();
			if (r > 0) raioinvalido = false;
			else System.out.println("Raio inválido. Por favor, digite novamente.");
		} while (raioinvalido);
		boolean arestainvalida = true;
		do{
			System.out.print("Agora digite a aresta do cubo: ");
			a = leitor.nextDouble();
			if (a > 0) arestainvalida = false;
			else System.out.println("Aresta inválida. Por favor, digite novamente.");
		} while (arestainvalida);
        	double volumeCubo = Math.pow(a, 3);
        	double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        	double volumeLivre = volumeCubo - volumeEsfera;

        	System.out.printf("O volume do ambiente livre é: %.2f%n", volumeLivre);
    	}
}	