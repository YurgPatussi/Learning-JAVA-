package controle.Exerc�cios;

import java.util.Scanner;

public class NumeroPrimo 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um N�mero: ");
		double numero = entrada.nextDouble();
		
		if (!(numero % 2 == 0))
			System.out.printf("\n NUMERO %.0f � PRIMO!", numero);
		
		else
			System.out.printf("NUMERO %.0f N�O � PRIMO!", numero);
		
		
		entrada.close();
	}
}
