package Fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
	
	System.out.print("Bom");
	System.out.print(" dia");
	
	System.out.println("\nGood");
	System.out.println("Morning");
	
	System.out.printf("Yurg: %d %d %d %d", 1, 2, 3, 4);
	System.out.printf(" \nSaldo: %.2f", 1000.00);
	
	Scanner entrada = new Scanner (System.in);
	
	System.out.print("\n\nWhat your fist name?");
	String nome = entrada.nextLine();
	
	System.out.print("\n\nWhat your last name?");
	String sobrenome = entrada.nextLine();
	
	System.out.print("\n\nHow old are you?");
	int idade = entrada.nextInt();
	 
	System.out.printf("%s %s tem %d anos",nome, sobrenome, idade);
	
	entrada.close();
	
	
	
}
}
