package Fundamentos;

import java.util.Scanner;

public class DesafiodeConversao 
{

	public static void main(String[] args) 
	
	{
	

	Scanner entrada = new Scanner(System.in);
	
	// 1� Sal�rio
	System.out.println("Informe o 1� sal�rio:");
	String salario1 = entrada.nextLine();
	
	// 2� Sal�rio
	System.out.println("Informe o 2� sal�rio:");
	String salario2 = entrada.nextLine();
	
	// 3� Sal�rio
	System.out.println("Informe o 3� sal�rio:");
	String salario3 = entrada.nextLine();
	
	
	String A1 = salario1.replace(",", ".");
	String A2 = salario2.replace(",", ".");
	String A3 = salario3.replace(",", ".");
	
	
	double B1 = Double.parseDouble(A1);
	double B2 = Double.parseDouble(A2);
	double B3 = Double.parseDouble(A3);
	
	double media = (B1+B2+B3)/3;

	System.out.printf("M�dia dos sal�rios" + ": R$%.2f ",media);
	
	entrada.close();

	}
	
}
