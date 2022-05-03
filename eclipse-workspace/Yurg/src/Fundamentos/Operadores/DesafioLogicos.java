package Fundamentos.Operadores;

public class DesafioLogicos 

{

	public static void main(String[] args) 
	
	{
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
        boolean condicao1 = trabalho1 & trabalho2;
        boolean condicao2 = trabalho1 ^ trabalho2;
        boolean condicao3 = trabalho1 || trabalho2;
        
        
       System.out.print("Familia irá comprar a TV 52 pol?");
       System.out.println( condicao1);
		
       System.out.print("Familia irá comprar a TV 32 pol?");
       System.out.println( condicao2);
       
       System.out.print("Familia irá tomar sorvete?");
       System.out.println( condicao3);
       
       System.out.println("Está mais saudável\"?"+ !condicao3);
	}
	
	
}
