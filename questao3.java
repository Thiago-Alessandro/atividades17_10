package atividades;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		double salario, salarioAjustado = 0;
		int opcao = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0;opcao != 0 || c == 0;c++) {
			
			System.out.println("\n\tMENU\n1 - Novo salário\n0 - sair");
			opcao = teclado.nextInt();
			
			switch (opcao){
				
				case 1:
					System.out.println("\nInsira o seu salário: ");
					salario = teclado.nextInt();
					
					salarioAjustado = salario + salario*23.75/100;
					
					System.out.println("\nO salário ajustado é de: " + salarioAjustado + "R$");
			}
		}
		
	}

}
