package lista25Exercicio;

import java.util.Scanner;

public class ReajusteEx10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu saldo");
		Double saldo = leia.nextDouble();
		
		double reajusteSaldo = saldo * 0.15;
		
		System.out.printf("O saldo, com o reajuste e de: %.3f" , reajusteSaldo + saldo);
	}

}
