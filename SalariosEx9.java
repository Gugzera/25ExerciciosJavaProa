package lista25Exercicio;

import java.util.Scanner;

public class SalariosEx9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Double qntdSalario;
		
		System.out.println("Digite seu salario");
		double salario = leia.nextDouble();
	
		qntdSalario = salario / 1212;

		System.out.printf("A quatidade de salarios minimos e de: %.2f" , qntdSalario);
	}

}
