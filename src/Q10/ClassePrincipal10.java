package Q10;

import java.util.Scanner;

public class ClassePrincipal10 {
	public static void main (String[] args) {
		
		int idade;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
	
		if (idade>17) {
			System.out.println("Maior de idade!");
		
		} else {
			System.out.println("Menor de idade!");
		}
		
	
	}

}
