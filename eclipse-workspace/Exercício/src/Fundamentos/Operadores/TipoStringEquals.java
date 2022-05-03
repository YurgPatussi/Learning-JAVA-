package Fundamentos.Operadores;

import java.util.Scanner;

public class TipoStringEquals 
{
public static void main(String[] args) 
{
	
	System.out.println("2"=="2");
	String S1 = new String ("2");
	System.out.println("2"== S1);
	
	Scanner teclado = new Scanner(System.in);
	String S2 = teclado.nextLine();
	System.out.println("2".equals(S2.trim()));
	
	teclado.close();
	
	
}
}
