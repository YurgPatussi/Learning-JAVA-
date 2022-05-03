package Fundamentos.Operadores;

public class Terciario 
{
	public static void main(String[] args) 
	{
		double media = 7.5;
		String resultadoFinal = media>=7.0 ? "aprovado" : "em recuperação.";
		
		System.out.printf("O aluno está %s", resultadoFinal);
		
	}
}
