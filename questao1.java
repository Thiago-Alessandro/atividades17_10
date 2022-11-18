package atividades;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		double celsius, fahrenheit;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em fahrenheit?");
		fahrenheit = teclado.nextInt();
		
		celsius = (fahrenheit - 32)*5/9;
		System.out.println(fahrenheit + "F° corresponde a " + celsius + "C°");
	}

}
