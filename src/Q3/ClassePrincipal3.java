package Q3;

import java.util.Scanner;

public class ClassePrincipal3 {
	private static Object desconto;

	public static void main (String[] args) {
		
		Dados d = new Dados();
		d.setSalário(0);
		d.setDesconto(0);
		d.setValor(0);
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu salário: ");
		int salario = sc.nextInt();
				
		if (salario<=600) {
			System.out.println("Insento.");
		} else if (salario>600 && salario<=1200) {
			desconto = salario*0.2;
		    System.out.println("Valor do seu desconto é "+ desconto);
		} else if (salario>1200 && salario<=2000) {
			desconto = salario*0.25;
			System.out.println("Valor do seu desconto é "+ desconto);
		} else if (salario>2000) {
			desconto = salario*0.3;
			System.out.println("Valor do seu desconto é "+ desconto);
		}
		
		
		
		
		
		
		
		
	}
}
