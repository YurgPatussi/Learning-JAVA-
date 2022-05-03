package Fundamentos.Operadores;

public class DesafioAritmetico 

{
	public static void main(String[] args) 
	
	{
		int a = 3 + 2;
		int b = 1 - 5;
		int c = 2 -7;
		
		double d = Math.pow(6*a, 2);
		double e = Math.pow((b*c)/2, 2);
		
		double f = d/(3*2);
		double g = e/1;
		
		double result = Math.pow((f-g),3);
		double end = result / Math.pow(10, 3);
		
		System.out.println(end);
	
	}
		
	
}
