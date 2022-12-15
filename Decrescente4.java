package lista25Exercicio;

import java.util.Scanner;

public class Decrescente4 {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int numA, numB, numC;
			System.out.println("Digite o primeiro valor:");
			numA = entrada.nextInt();
			System.out.println("Digite o segundo valor:");
			numB = entrada.nextInt();
			System.out.println("Digite o terceiro valor:");
			numC = entrada.nextInt();

			if (numB > numA && numB > numC) {
				if(numC > numA) {				
					System.out.println(numB + " " + numC + " " + numA );
				}else {
					System.out.println(numB + " " + numA + " " + numC );
				}
			}else if (numC > numA && numC > numB) {
				if(numA > numB) {				
					System.out.println(numC + " " + numA + " " + numB );
				}else {
					System.out.println(numC + " " + numB + " " + numA );
				}
			}else {
				System.out.println(numA + " " + numB + " " + numC);
			}

				
		}


	}

