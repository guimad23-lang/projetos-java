/**
 * Exercício 13 - Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da
 * velocidade final, da aceleração e do tempo de percurso que serão digitados.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;

public class TP01Ex13 {	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o valor da velocidade inicial do automóvel em metros por segundo: ");
		double vi = leitor.nextDouble();
                System.out.print("Digite o valor da aceleração em metros por segundo ao quadrado: ");
		double a = leitor.nextDouble();
		boolean tempoinvalido = true;
		double t = 0;
		do{
			System.out.print("Digite o tempo em segundos: ");
			t = leitor.nextDouble();
			if (t > 0) tempoinvalido = false;
			else System.out.println("Tempo inválido. Por favor, digite novamente.");
		} while (tempoinvalido);
		System.out.printf("A velocidade final do automóvel em km/h é de: %.2f%n", (3.6*((vi+(a*t)))));
	}
}