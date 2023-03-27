package Q12;

import java.util.Scanner;

public class ClassePrincipal12 {
	public static void main (String[] args) {
		
		double salariobruto, prestacao;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu salário bruto: ");
		salariobruto = sc.nextDouble();
		System.out.println("Digite o valor da prestação: ");
		prestacao = sc.nextDouble();
		
		
		if (prestacao<=salariobruto*0.3) {
			System.out.println("Emprestimo concedido!");
			
		} else if (prestacao>salariobruto*0.3){
			System.out.println("Emprestimo não pode ser concedido!");
		}

	}
}
