package controle;

import java.util.Scanner;

public class DoWhile 
{	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe alguma palavra: ");
		
		String nome = entrada.next();
		
		do {System.out.println("Inform other: ");
			nome = entrada.next();
			
		}
		
		while (!nome.equalsIgnoreCase("Band"));
		{
			System.out.println("Fim");
		}
		
		
		entrada.close();
		
	}

}
