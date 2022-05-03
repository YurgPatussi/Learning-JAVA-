package Fundamentos.Operadores;

public class Logicos 

{

	public static void main(String[] args) 
	
	{
		
	boolean condicao1 = true;
	boolean condicao2 = 3>4;
	
	System.out.println(condicao1 && condicao2);
	System.out.println(condicao1 || condicao2);
	System.out.println(condicao1 ^ condicao2);
	System.out.println(!condicao1);
	System.out.println(!!condicao2 );

	System.out.println("Tabela Verdade E (AND)");
	System.out.println(true && true);
	System.out.println(true && !true);
	System.out.println(false ^true);
	//System.out.println(!false || true);
	System.out.println("Tabela Verdade OU (OUR)");
	// System.out.println(true || true);
	// System.out.println(true || !true);
	System.out.println(false ||true);
	//System.out.println(!false || true);
	
	System.out.println("Tabela Verdade NOT");
	System.out.println(!true);
	System.out.println(!true || !true);
	System.out.println(!false);
    //System.out.println(!false || true);
	
	
	
	}
	
}
