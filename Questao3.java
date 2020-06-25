package br.edu.univas.main;
import java.util.Scanner;

public class Questao3 {
	Scanner input = new Scanner(System.in);

	int numero = input.nextInt();
	int x = numero;
			
	while(x % 5 != 0) {
		x++; 
	}
	System.out.println(x);
	if (x - numero >= 3) {
		System.out.println("não arredonda");
	} else {
		System.out.println(x);
	}
	
}
}
