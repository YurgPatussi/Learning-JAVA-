package controle.Exercícios;

import java.util.Scanner;

public class NumeroPrimo 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um Número: ");
		double numero = entrada.nextDouble();
		
		if (!(numero % 2 == 0))
			System.out.printf("\n NUMERO %.0f É PRIMO!", numero);
		
		else
			System.out.printf("NUMERO %.0f NÃO É PRIMO!", numero);
		
		
		entrada.close();
	}
}
