package controle.Exerc�cios;

import java.util.Scanner;

public class Primeiro 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um n�mero:");
		double numero = entrada.nextDouble();
		
		if (numero % 2 == 0)
			System.out.println("N�mero � par.");
		else 
			System.out.println("N�mero N�O � par");
		
		if ((numero>=0) && (numero <=10))
			System.out.println("Numero est� em 0 e 10!");	
		else 
			System.out.println("N�mero n�o est� entre 0 e 10!");
		entrada.close();
		
		
	}

}
