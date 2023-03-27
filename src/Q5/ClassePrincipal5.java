package Q5;

import java.util.Scanner;

public class ClassePrincipal5 {
	public static void main (String[] args) {
		int numero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		
		if (numero>=20) {
			System.out.println("A metade do número digitado é: "+ (numero/2));
			
		} else {
			System.out.println("Inválido!!");
		}
		
		
	}
}
