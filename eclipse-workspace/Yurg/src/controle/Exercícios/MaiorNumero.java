package controle.Exerc�cios;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) 
	{
	Scanner entrada = new Scanner (System.in);


	double numero =0;
	double maior =0;
	
	for (int cont = 0; cont<10 ; cont++)
	{
		System.out.println("INFORME UM N�MERO: ");
		numero = entrada.nextDouble();
		
		if (numero > maior)
			maior = numero;
		
	}
	System.out.printf("\nMAIOR N�MERO INFORMADO � %.1f",maior);
	entrada.close();	
	}
}
	