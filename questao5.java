package atividades;

import java.util.Scanner;

public class questao5 {
	
	public static void main(String[] args) {

	int diasDeAtraso;
	double prestacaoInicial,prestacaoFinal,jurosDiario;
	
	Scanner teclado = new Scanner (System.in);
	
	System.out.print("Insira ovalor da prestação: ");
	prestacaoInicial = teclado.nextDouble();
	
	System.out.print("Insira o número de dias de atraso: ");
	diasDeAtraso = teclado.nextInt();
	
	System.out.print("Insira a taxa de juros diária: ");
	jurosDiario = teclado.nextDouble();
	
	prestacaoFinal =prestacaoInicial + prestacaoInicial*(jurosDiario/100)*diasDeAtraso;
	
	System.out.print("A prestação atrasada a ser paga é de: R$"+prestacaoFinal);
	}
}
