package controle.Exerc�cios;

import java.util.Scanner;

public class JogoAdivinha 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		int valor = 100;
		int contador = 9;
		System.out.print("INFORME UM NUMERO:");
		int num = entrada.nextInt();
		
		
		while ((contador > 0) && (num!=valor))
		{
		
		System.out.printf("RESTA APENAS %d TENTATIVAS\n", contador);
		contador--;
		if (num < valor)
			System.out.println("NUMERO � MAIOR");
		else 
			System.out.println("NUMERO E MENOR");
		
		System.out.print("\nINFORME UM NUMERO:");
		num = entrada.nextInt();
		
		}
		
		
		if (num == valor)
			System.out.println("VOC� ACERTOU!!!");
		else
			System.out.println("INFELIZMENTE VOC� N�O ACERTOU.");
		
		
		int tentativas = 10 - contador;
		
		System.out.println("Numero de tentativa:"+tentativas);	
	
		entrada.close ();
	}
}
