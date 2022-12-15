package lista25Exercicio;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.println("digite sua idade");
		idade = leia.nextInt();

		if(idade<=16) {
			System.out.println("Não Eleitor");
		} else if(idade>=18 && idade<=65) {
			System.out.println("Eleitor obrigatório");
		} else {
			System.out.println("Eleitor facultativo");
		}
	}

}
