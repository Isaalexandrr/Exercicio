package Q8;

import java.util.Scanner;

public class ClassePrincipal8 {
	public static void main (String[] args) {
		
		int n1,n2;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um número: ");
		n1 = sc.nextInt();
		System.out.println("Informe outro número: ");
		n2 = sc.nextInt();
		
		if (n1>n2) {
			System.out.println("Em ordem decrescente " + n1 + n2);
		} else {
			System.out.println("Em ordem decrescente "+ n2 + n1);
		}
		
	}
}
