package Q6;

import java.util.Scanner;

public class ClassePrincipal6 {
	public static void main (String[] args) {
		int numero; 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero>=50 && numero<=100) {
			System.out.println("Pertence ao intervalo");
		} else  {
			System.out.println("Não pertence ao intervalo");
		}
		
		
	}
}
