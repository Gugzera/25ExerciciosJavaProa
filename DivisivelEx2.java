package lista25Exercicio;

import java.util.Scanner;

public class DivisivelEx2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1 = 0;
		int rest10 = 0;
		int rest5 = 0;
		int rest2 = 0;

		System.out.println("Digite o número desejado");
		num1 = leia.nextInt();
		
		rest10 = num1 % 10;
		rest5 = num1 % 5;
		rest2 = num1 % 2;
		
		if(rest10 == 0 && rest5 ==0 && rest2 == 0) {
		 	System.out.println("O numero e divisivel por 10, 5 e 2");
		}else if(rest10 != 0 && rest5 !=0 && rest2 == 0) {
			System.out.println("O numero e divisivel apenas por 2");
		}else if(rest10 != 0 && rest5 ==0 && rest2 != 0) {
			System.out.println("O numero e divisivel apenas por 5");
		}else{
		 	System.out.println("O numero NAO e divisivel por 10, 5 e 2");
		}
	}

}
