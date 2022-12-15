package lista25Exercicio;

import java.util.Scanner;

public class Exercicio6 {
	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int num1 = 0;
			int anterior = 0;
			int sucessor = 0;
			

			System.out.println("Digite o numero desejado");
			num1 = leia.nextInt();
			
			anterior = num1 - 1;
			sucessor = num1 + 1;
			
			System.out.println("O antecessor do numero " + num1 + " e: " + anterior + " e seu sucessor é: " + sucessor);
		}

	}
