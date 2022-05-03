package Fundamentos.Exercícios;

import java.util.Scanner;

public class Potencia 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Inforne o valor: ");
		double num01 = entrada.nextDouble();
		
		double A = Math.pow(num01, 2);
		
		double B = Math.pow(num01, 3);
		
		System.out.printf("Valor ao quadrado: %.2f\n",A);
		System.out.printf("Valor ao cubo: %.2f",B);

		
		entrada.close();
		
	}
}
