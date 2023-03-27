package Q1;

import java.util.Scanner;

public class ClassePrincipal1 {
	
	public static void main(String[]  args) {
		
		conta n = new conta ();
		
		n.setNumero1(null);
		n.setNumero2(null);
		n.setNumero3(null);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite um número: ");
		int n2 = sc.nextInt();
		System.out.println("Digite um número: ");
		int n3 = sc.nextInt();
		
		if (n1>n2 && n1>n3){
		 System.out.println("O número maior é " + n1);
		} else if (n2>n1 && n2>n3){
		 System.out.println("O número maior é " + n2);	
		} else if (n3>n1 && n3>n2){
			System.out.println("O número maior é " + n3);
		}	
	}
}

