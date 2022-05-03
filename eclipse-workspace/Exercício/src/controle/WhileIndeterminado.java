package controle;

import java.util.Scanner;

public class WhileIndeterminado 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite uma palavra:");
		String Nome = entrada.next();
		
		while(!Nome.equalsIgnoreCase("sair"))
		{
		System.out.println("Other");
		Nome = entrada.next();
		}
		System.out.println("Fim");
		entrada.close();	
	}
}
