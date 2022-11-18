package atividades;

	import java.util.Scanner;
	
	public class questao2 {
	
		public static void main(String[] args) {
			double celsius;
			double fahrenheit;
			
			Scanner teclado = new Scanner (System.in);
			
			System.out.print("escreva a temperatura em celsius: ");
			celsius= teclado.nextDouble();
			
			fahrenheit = (celsius*9/5) + 32;
			System.out.print(fahrenheit+"°F");
	}

}