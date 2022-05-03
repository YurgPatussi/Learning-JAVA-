package Fundamentos.Exercícios;

import java.util.Scanner;


public class Bhaskara 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Valor de A: ");
		String A = entrada.nextLine();
		A = A.replaceAll(",", ".");
		double X = Double.parseDouble(A);
		
		System.out.println("Valor de B: ");
		String B = entrada.nextLine();
		B = B.replaceAll(",", ".");
		double Y = Double.parseDouble(B);
		
		System.out.println("Valor de C: ");
		String C = entrada.nextLine();
		C = C.replaceAll(",", ".");
		double Z = Double.parseDouble(C);

		
		double delta = Math.pow(Y,2) - (4*X*Z);
		
		System.out.printf("Valor de delta: %.2f",delta);
		
		entrada.close();
		
	}
}
