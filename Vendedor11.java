package lista25Exercicio;

import java.util.Scanner;

public class Vendedor11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		Double salario;
		int vendas;
		Double reajuste;
		Double salNovo;
		
		System.out.println("Digite seu nome");
		nome = leia.nextLine();
		
		System.out.println("Digite seu salario");
		salario = leia.nextDouble();
		
		System.out.println("Digite sua quantidade de vendas");
		vendas = leia.nextInt();
		
		reajuste = vendas * 0.15;
		salNovo = salario + reajuste;
		
		System.out.println("O nome do usuario e: " + nome);
		System.out.println("O salario antigo do usuario e: " + salario);
		System.out.println("A quantidade de vendas deese vendedor e: " + vendas);
		System.out.println("O salario final e de: " + salNovo);
		
	}

}
