/**
 * Exercício 16 - Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes 
 * funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. Lembre-se que uma função  
 * trigonométrica trabalha em radianos.
 * Desenvolvido por Guilherme Bertero e Guilherme Francisco
 */

import java.util.Scanner;
import java.lang.Math;       

public class TP01Ex16 {

	public static double truncar(double valor){
		return Math.floor(valor*100)/100.0;
	}	

	public static void main(String[] args) {
        	Scanner leitor = new Scanner(System.in);
		boolean anguloinvalido = true;
		double angulo = 0;
		do{
			System.out.print("Digite o ângulo em graus: ");
			angulo = leitor.nextDouble();
			if (angulo >= 0) anguloinvalido = false;
			else System.out.println("Ângulo inválido. Por favor, digite novamente.");
		} while (anguloinvalido);
        	double radianos = Math.toRadians(angulo);
        	System.out.printf("Seno: %.2f%n", Math.sin(radianos));
		double cosseno = truncar(Math.cos(radianos));
		if (cosseno != 0){
			System.out.printf("Cosseno: %.2f%n", cosseno);
			System.out.printf("Tangente: %.2f%n", Math.tan(radianos));
			System.out.printf("Secante: %.2f%n", 1.0/cosseno);
		}
		else System.out.println("O cosseno desse ângulo é igual a 0. Desse modo, tanto a tangente quanto a secante não podem ser definidos.");
        }
}