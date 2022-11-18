package atividades;

import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
		
		double distancia, horas, velocidadeMedia = 0.0;
		String nome = new String("");
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Insira o seu nome: ");
		nome = teclado.next();
		
		System.out.print("Insira a distância percorrida (em km): ");
		distancia = teclado.nextDouble();
		
		System.out.print("Insira o tempo levado para percorrer a distância (em horas): ");
		horas = teclado.nextDouble();
		
		velocidadeMedia  = distancia/horas;
		
		System.out.print("A velocidade média do piloto " + nome + " foi: " + velocidadeMedia + "km/h");
	}

}
