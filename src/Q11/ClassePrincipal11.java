package Q11;

import java.util.Scanner;

public class ClassePrincipal11 {
	
	public static void main (String[] args) {
		
		double altura, resultado;
		String sexo;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		System.out.println("Digite seu sexo: ");
		System.out.println("M. Masculino");
		System.out.println("F. Feminino");
		sexo = sc.next();
		
		if (sexo == "F") {
			resultado = ((62.1*altura)-44.7);
			System.out.println("Seu peso ideal é "+ resultado);
		} else {
			resultado = ((72.7*altura)-58);
			System.out.println("Seu peso ideal é "+ resultado);
			
		}
		
		
		
	}

}
