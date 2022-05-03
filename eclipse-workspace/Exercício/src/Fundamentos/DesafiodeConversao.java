package Fundamentos;

import java.util.Scanner;

public class DesafiodeConversao 
{

	public static void main(String[] args) 
	
	{
	

	Scanner entrada = new Scanner(System.in);
	
	// 1º Salário
	System.out.println("Informe o 1º salário:");
	String salario1 = entrada.nextLine();
	
	// 2º Salário
	System.out.println("Informe o 2º salário:");
	String salario2 = entrada.nextLine();
	
	// 3º Salário
	System.out.println("Informe o 3º salário:");
	String salario3 = entrada.nextLine();
	
	
	String A1 = salario1.replace(",", ".");
	String A2 = salario2.replace(",", ".");
	String A3 = salario3.replace(",", ".");
	
	
	double B1 = Double.parseDouble(A1);
	double B2 = Double.parseDouble(A2);
	double B3 = Double.parseDouble(A3);
	
	double media = (B1+B2+B3)/3;

	System.out.printf("Média dos salários" + ": R$%.2f ",media);
	
	entrada.close();

	}
	
}
