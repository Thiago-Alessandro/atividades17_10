package atividades;

import java.util.Scanner;

public class questao5 {
	
	public static void main(String[] args) {

	int diasDeAtraso;
	double prestacaoInicial,prestacaoFinal,jurosDiario;
	
	Scanner teclado = new Scanner (System.in);
	
	System.out.print("Insira ovalor da presta��o: ");
	prestacaoInicial = teclado.nextDouble();
	
	System.out.print("Insira o n�mero de dias de atraso: ");
	diasDeAtraso = teclado.nextInt();
	
	System.out.print("Insira a taxa de juros di�ria: ");
	jurosDiario = teclado.nextDouble();
	
	prestacaoFinal =prestacaoInicial + prestacaoInicial*(jurosDiario/100)*diasDeAtraso;
	
	System.out.print("A presta��o atrasada a ser paga � de: R$"+prestacaoFinal);
	}
}
