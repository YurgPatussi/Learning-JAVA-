package Fundamentos.Exercícios;

import java.util.Scanner;

public class FahrenheitParaCelsius 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a temperatura em Fahrenheit?");
		double tem01 = entrada.nextDouble();
		double tem02 = tem01 - 32;
		double razao = (double) 5/9;
		double tem03 = tem02 * razao;
		
		System.out.println("Temperatura em Celsius:" + tem03);
		
		entrada.close();
	}
}
