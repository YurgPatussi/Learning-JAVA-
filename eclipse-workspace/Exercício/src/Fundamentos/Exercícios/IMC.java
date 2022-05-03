package Fundamentos.Exercícios;

import java.util.Scanner;


public class IMC 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe a altura: ");
		
		String altura = entrada.nextLine();
		altura = altura.replaceAll(",", ".");
		
		double High = Double.parseDouble (altura);
		
		System.out.println("Informe seu peso: ");
		double peso = entrada.nextDouble();		
		
		double calculo = Math.pow(High,2);
		double IMC = peso/calculo;
		
		System.out.printf("Valor de IMC: %.2f",IMC);
		
		
		entrada.close();
	}
}
