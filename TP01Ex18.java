/**
 * Exercício 18 - Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor 
 * referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;

public class TP01Ex18 {
	public static void main(String[] args) {
        	Scanner leitor = new Scanner(System.in);
        	double soma = 0;
        	for (int i = 1; i <= 5; i++) {
            		System.out.print("Digite o valor do " + i + "º produto: ");
            		double valor = leitor.nextDouble();
			if (valor > 0) soma += valor;
            		else{
				System.out.println("Valor inválido. Por favor, digite novamente.");
				i--;
			}
        	}
		boolean pagamentoinvalido = true;
		double pagamento = 0;
		do{
			System.out.print("Digite o valor pago: ");
        		pagamento = leitor.nextDouble();
			if (pagamento > 0) pagamentoinvalido = false;
			else System.out.println("Pagamento inválido. Por favor, digite novamente.");
		} while (pagamentoinvalido);
        	double troco = pagamento - soma;
        	System.out.printf("Total da compra: R$%.2f%n", soma);

        	if (troco >= 0) System.out.printf("Troco: R$%.2f%n", troco);
        	else System.out.printf("Valor insuficiente! Falta: R$%.2f%n", (-troco));
    	}
}