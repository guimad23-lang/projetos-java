/**
 * Exercício 10 - Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua
 * temperatura equivalente em Fahrenheit.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;

public class TP01Ex10 {
	public static void main(String[] args) { 	
		Scanner leitor = new Scanner(System.in);
		boolean temperaturainvalida = true;
		double celsius = 0;
		do{
			System.out.print("Digite a temperatura em graus celsius: ");
			celsius = leitor.nextDouble();
			if (celsius > -273.15) temperaturainvalida = false;
			else System.out.println("Temperatura inválida. Por favor, digite novamente.");
		} while (temperaturainvalida);
		System.out.printf("A temperatura em Fahreinheit é de: %.2f%n", (celsius*1.8)+32);
	}
}