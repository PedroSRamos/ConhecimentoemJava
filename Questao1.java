package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner java = new Scanner(System.in);
		int cont = 0;	
		
		do {
			int numero = java.nextInt();
				if (numero < 0) {
					cont++;
				}
				
				else if (numero == 0) {
					break;
				}
			
		} while (true);
		
		System.out.println("total de numeros é: "+ cont);		
		java.close();
	}

}