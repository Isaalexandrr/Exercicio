package Q7;

import java.util.Scanner;

public class ClassePrincipal7 {
	public static void main (String[] args) {
		int numero1, numero2;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número:");
		numero1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		numero2 = sc.nextInt();
		
		if (numero1>numero2) {
			System.out.println("A diferença entre os números é "+ (numero1-numero2));
		} else {
			System.out.println("A diferença entre os número é "+ (numero2-numero1));
		}
			
		
		
		
	}
}
