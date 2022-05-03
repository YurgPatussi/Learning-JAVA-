package Fundamentos;

import java.util.Date;

public class TipoString {

	public static void main(String[] args) 
	
	{
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		
		var nome = "Yurg";
		var sobrenome = "Patussi";
		double idade = 27;
		
		System.out.println("Nome: "+ nome + "\nSobrenome: " + sobrenome + "\nIdade: ");
	    String frase = String.format("Nome: %s \nSobrenome: %s \nIdade: %.0f" ,nome, sobrenome, idade);
	    System.out.println(frase);
	    
	    System.out.println(nome.toUpperCase());
	    Date d = new Date ();
	    System.out.println(d);
	    
	    System.out.println(nome.describeConstable());
	    System.out.println(nome.charAt(3));
	    System.out.println(sobrenome.contentEquals("Patussi"));
	    
	    
	    
	}  
	
}
