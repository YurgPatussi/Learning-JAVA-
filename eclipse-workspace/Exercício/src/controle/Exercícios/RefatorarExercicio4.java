package controle.Exercícios;

import java.util.Scanner;

public class RefatorarExercicio4 {
public static void main(String[] args)
{
	Scanner entrada = new Scanner (System.in);
	System.out.println("INFORME UM NÚMERO:");
	double numero = entrada.nextDouble();
	int Cont = 0;

	for (int i = 2;i< numero ; i++)
		{
		if (numero % i == 0) {
		Cont++;}
		}
	
	
	switch (Cont)
	{
	case 0:
		System.out.println("NUMERO É PRIMO");
	    break;  
	
	default:
		System.out.println("NUMERO NÃO É PRIMO");
	
	}
	entrada.close();
}
}
