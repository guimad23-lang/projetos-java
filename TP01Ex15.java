/**
 * Exercício 15 - Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. 
 * Calcular e exibir o valor correspondente em reais.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;

public class TP01Ex15 {
    	public static void main(String[] args) {
        	Scanner leitor = new Scanner(System.in);
		double cotacao = 0;
		double valor = 0;
		boolean cotacaoinvalida = true;
		do{
			System.out.print("Digite a cotação atual do dólar: ");
			cotacao = leitor.nextDouble();
			if (cotacao > 0) cotacaoinvalida = false;
			else System.out.println("Cotação inválida. Por favor, digite novamente.");
		} while (cotacaoinvalida);
		boolean valorinvalido = true;
		do{
			System.out.print("Digite o valor em dólar: ");
			valor = leitor.nextDouble();
			if (valor > 0) valorinvalido = false;
			else System.out.println("Valor inválido. Por favor, digite novamente.");
		} while (valorinvalido);
        	System.out.printf("O valor é de R$ %.2f%n", (cotacao*valor));
    	}
}