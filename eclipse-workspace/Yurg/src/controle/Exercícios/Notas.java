package controle.Exercícios;

import java.util.Scanner;

public class Notas 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("INFORME A PRIMEIRA NOTA:");
		double nota1 = entrada.nextDouble();
		
		System.out.print("\nINFORME A SEGUNDA NOTA:");
		double nota2 = entrada.nextDouble();

		double media = (nota1+nota2) / 2;
		
if (media >= 7)
	System.out.println("APROVADO!");
else if (media < 7 && media >= 4)
	System.out.println("RECUPERAÇÃO!");
else 
	System.out.println("REPROVADO!");
	
		entrada.close();
	}
}
