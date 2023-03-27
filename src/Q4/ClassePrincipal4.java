package Q4;

import java.util.Scanner;

public class ClassePrincipal4 {
	public static void main (String[] args) {
		
		Calculadora c = new Calculadora ();
		c.setNumero1(0);
		c.setNumero2(0);
		c.setOperacao(0);
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		double c1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double c2 = sc.nextDouble();
		System.out.println("Digite a operação a realizar: ");
		System.out.println("1.Soma");
		System.out.println("2.Subtração");
		System.out.println("3.Multiplicação");
		System.out.println("4.Divisão");
		double c3 = sc.nextDouble();
		
		if (c3==1) { 
			System.out.println("O resultado é "+ (c1+c2));
			
	
		} else if (c3==2){
			System.out.println("O resultado é "+ (c1-c2));
		
		
		} else if (c3==3) {
			System.out.println("O resultado é "+ (c1*c2));
		

		} else if (c3==4) {
			System.out.println("O resultado é "+ (c1/c2));
			
			sc.nextDouble();
		} else {
			System.out.println("Opção inválida");
			
		} 			
	}
}
