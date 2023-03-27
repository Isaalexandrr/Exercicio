package Q9;

import java.util.Scanner;

public class ClassePrincipal9 {
	public static void main (String[] args) {
	
		int salario, anos;
		double bonus;
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("Digite o seu salário:");
	  salario = sc.nextInt();
	  System.out.println("Digite seus anos de empresa:");
	  anos = sc.nextInt();
	  
	  if (anos<5) {
		  bonus=salario*0.1;
		  System.out.println("Seu salário final é: "+ (salario+bonus));	 			 
	  } else if (anos>=5) {
		  bonus=salario*0.2;
		  System.out.println("Seu salário final é "+ (salario+bonus));
	  }
	  
		
		
		
		
	}
}
