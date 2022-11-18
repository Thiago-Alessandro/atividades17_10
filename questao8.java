package atividades;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		
		double salarioFixo, salarioTotal = 0.0, totalDeVendas, percentualGanhoVendas = 0.0;
		String nome = new String("");
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Insira o seu nome: ");
		nome = teclado.next();
		
		System.out.print("Insira o seu salário fixo: ");
		salarioFixo = teclado.nextDouble();
		
		System.out.print("Insira o totas de vendas: R$");
		totalDeVendas = teclado.nextDouble();
		
		System.out.print("Insira o seu percentual de ganho sobre as vendas: ");
		percentualGanhoVendas = teclado.nextDouble();
		
		salarioTotal = salarioFixo + percentualGanhoVendas/100*totalDeVendas;
				
		System.out.print("O vendedor " + nome + "tem um salário de: " + salarioTotal);
	}

}
