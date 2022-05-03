package controle.Exercícios;

import java.util.Scanner;

public class SegundoAno
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe o ano:");
		int Ano = entrada.nextInt();
		
		
		if (Ano % 4 == 0)
		System.out.println("Ano é Bissexto!");
		
		else 
			System.out.println("Ano não é Bissexto!!!");
		
		entrada.close();
	}
}
