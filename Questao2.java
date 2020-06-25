package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[] args) {
		
		Scanner java = new Scanner(System.in);
		
		int Corona = 0; 
		int Regiao = 0;
		int sim = 0;
		int nao = 0;
		int sul = 0;
		int sudeste = 0;
		int centroeste = 0;
		int norte = 0;
		int nordeste = 0;
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			
			Corona = java.nextInt();
			
			System.out.println("Qual região do Brasil você mora?");
			
			Regiao = java.nextInt();
			
			if (Corona == 1) {
				sim++;
				
			}else if (Corona == 2) {
				nao++;
				
			}
			
			if (Regiao == 1) {
				sul++;
				
			}else if (Regiao == 2) {
				sudeste++;
				
			}else if (Regiao == 3) {
				centroeste++;
				
			}else if (Regiao == 4) {
				norte++;
				
			}else if (Regiao == 5) {
				nordeste++;
			}
		}
		
		System.out.println("Pessoas votaram sim = "+ sim);
		System.out.println("Pessoas votaram não = "+ nao);
		System.out.println("Pessoas do Sul que participaram = "+ sul);
		System.out.println("Pessoas do Sudeste que participaram = "+ sudeste);
		System.out.println("Pessoas do Centroeste que participaram = "+ centroeste);
		System.out.println("Pessoas do Norte que participaram = "+ norte);
		System.out.println("Pessoas do Nordeste que participaram = "+ nordeste);
		
		java.close();
		
	}

}