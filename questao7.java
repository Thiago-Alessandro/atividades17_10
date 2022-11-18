package atividades;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		
		double chuvaPolegadas, chuvaMilimetros = 0.0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Insira a quantia de chuava em polegadas: ");
		chuvaPolegadas = teclado.nextDouble();
		
		chuvaMilimetros = chuvaPolegadas*25.4;
		
		System.out.print("A quantia de chuva correspondente em milimetros é: " + chuvaMilimetros);
	}

}
