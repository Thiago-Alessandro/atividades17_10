package atividades;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		double numero, somaNumeros = 0, mediaNumeros = 0, contador=0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(;contador<4;contador++) {
			
		System.out.print("Insira um n�mero inteiro: ");
		numero  = teclado.nextDouble();
		somaNumeros += numero;
		}
		
		mediaNumeros = somaNumeros/contador;
		System.out.print("a m�dia dos n�meros �: " + mediaNumeros);
	}

}
