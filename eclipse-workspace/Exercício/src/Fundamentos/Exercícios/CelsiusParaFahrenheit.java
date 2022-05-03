package Fundamentos.Exercícios;

import java.util.Scanner;

public class CelsiusParaFahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a temperatura em Celsius ?");
		double tem01 = entrada.nextDouble();
		double razao = (double) 9/5;
		double tem02 = tem01 * razao;
		
		double tem03 = 32 + tem02;
		
		System.out.println("Temperatura em Fahrenheit:" + tem03);
		
		entrada.close();
	}
}
