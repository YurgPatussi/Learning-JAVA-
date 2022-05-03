package Fundamentos.Exercícios;

import java.util.Scanner;

public class AreadoTriangulo 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe valor da base:");
		double base = entrada.nextDouble();
		System.out.println("Informe valor da altura:");
		double altura = entrada.nextDouble();
		
		double area = (base * altura ) / 2;
		System.out.printf("O valor da área é %.2f m²", area);
		entrada.close();
		
	}
}
