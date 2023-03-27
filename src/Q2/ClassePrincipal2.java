package Q2;

import java.util.Scanner;

public class ClassePrincipal2 {
	public static void main (String[] args) {
		
		Dados d = new Dados();
		d.setIdade(0);
		d.setNome(null);
	
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite seu nome: ");
		d.setNome(sc.nextLine());
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade>0 && idade<5) {
			System.out.println("Bebê");
		} else if (idade>=5 && idade<=7) {
			System.out.println("Infantil A");
		} else if (idade>=8 && idade<=10) {
			System.out.println("Infantil B");
		} else if (idade>=11 && idade<=13) {
			System.out.println("Juvenil A");
		} else if (idade>=14 && idade<=17) {
			System.out.println("Juvenil B");
		} else if (idade>=18) {
			System.out.println("Sênior");
		}
		
		
		
	
 }
}