package lista25Exercicio;

import java.util.Scanner;

public class SalarioEx3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double sal, cod, salNovo, perc;
		
		System.out.println("DIGIE O SEU SALARIO"); 	
		sal = entrada.nextDouble();	
		
	if(sal > 0 && sal <=500) {
		salNovo = sal;
		perc = (salNovo - sal);
		System.out.println("O seu saldo medio e: " + sal);
		System.out.println("O seu novo saldo e: " + salNovo);
		System.out.printf("O seu aumento foi de: %.2f \n" + perc);
		System.out.println("O desconto foi de 0%");
	}
	
	if(sal > 500 && sal <=1000) {
		salNovo = sal + (sal * 0.3);
		perc = (salNovo - sal);
		System.out.println("O seu saldo medio e: " + sal);
		System.out.println("O seu novo saldo e: " + salNovo);
		System.out.printf("O seu aumento foi de: %.2f \n" + perc);
		System.out.println("O desconto foi de 30%");
	}
	
	if(sal > 1000 && sal <=3000) {
		salNovo = sal + (sal * 0.4);
		perc = (salNovo - sal);
		System.out.println("O seu saldo medio e: " + sal);
		System.out.println("O seu novo saldo é: " + salNovo);
		System.out.printf("O seu aumento foi de: %.2f \n" , perc );
		System.out.println("O desconto foi de 40%");
	}
	
	if(sal > 3000) {
		salNovo = sal + (sal * 0.5);
		perc = (salNovo - sal);
		System.out.println("O seu saldo medio e: " + sal);
		System.out.println("O seu novo saldo e: " + salNovo);
		System.out.printf("O seu aumento foi de: %.2f \n" + perc);
		System.out.println("O desconto foi de 50%");
	} else {
		System.out.println("digite um numero positivo");
	}
	
	}
}