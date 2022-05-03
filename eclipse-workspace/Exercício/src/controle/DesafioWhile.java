package controle;

import java.util.Scanner;

public class DesafioWhile 
{
	public static void main(String[] args) 
	{ 
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe uma nota: ");
		double nota = entrada.nextDouble();
		int num1 = -1;
		double soma = 0;
		double contador = 0;
		
		while (!(nota == num1))

		    
			
			if (nota >= 0 && nota <= 10)
			
			{
			contador = contador + 1;
			soma = nota + soma;
			System.out.println("Informe a próxima nota: ");
			nota = entrada.nextDouble();
			}
	
			
			else if (!(nota >= 0) || !(nota <= 10))
		    	
				while (!(nota == num1) && (!(nota >= 0) || !(nota <= 10)))
				{
				System.out.println("Informe uma nota válida: ");	
			    nota = entrada.nextDouble();
				}
				
		    	
		double media = soma / contador;
		
		System.out.printf("\nSoma das Notas: %.2f", soma);
		System.out.printf("\nQuantidade de notas válidas: %.0f", contador);
		System.out.printf("\nMédia: %.2f", media);

	
		entrada.close();
		
	}
}
