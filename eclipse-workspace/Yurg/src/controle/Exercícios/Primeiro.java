package controle.Exercícios;

import java.util.Scanner;

public class Primeiro 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um número:");
		double numero = entrada.nextDouble();
		
		if (numero % 2 == 0)
			System.out.println("Número é par.");
		else 
			System.out.println("Número NÃO é par");
		
		if ((numero>=0) && (numero <=10))
			System.out.println("Numero está em 0 e 10!");	
		else 
			System.out.println("Número não está entre 0 e 10!");
		entrada.close();
		
		
	}

}
