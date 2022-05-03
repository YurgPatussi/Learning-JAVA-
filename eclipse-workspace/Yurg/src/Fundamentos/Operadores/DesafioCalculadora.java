package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioCalculadora 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro valor?");
		double A = entrada.nextDouble();
		
		System.out.println("Digite o segundo valor?");
		double B = entrada.nextDouble();
		
		System.out.println("Digite o operação?");
	    String C = entrada.next();
	    
	   double resultado = "+".equals(C)? A + B: 0; 
	   resultado = "-".equals(C)? A - B : resultado;
	   resultado = "*".equals(C)? A * B : resultado;
	   resultado = "/".equals(C)? A / B : resultado;
	   resultado = "%".equals(C)? A % B : resultado;

	   
	    System.out.printf("%.2f %s %.2f = %.2f", A, C, B, resultado);
		entrada.close();
		
	}
}
