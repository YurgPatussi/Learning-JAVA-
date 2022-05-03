package Classe;

import java.util.Scanner;

public class Jantar {
public static void main(String[] args)
{
	Scanner entrada = new Scanner(System.in);
	double A1 = 0;
	double B1 = 0;
	
	System.out.print("FAVOR INFORMAR SER NOME:\n");
	
	String X = entrada.next().toUpperCase();
	
	System.out.printf("OLÁ %s, FAVOR INFORMAR SEU PESO: \n", X);
	double Y = entrada.nextDouble();
    
	System.out.println("QUAL PRATO VOCÊ GOSTARIA: \n"
			+ "[1] ARROZ\n[2] FEIJÃO\n");
	int opção = entrada.nextInt();
	
	Pessoa N1 = new Pessoa (X,Y); {}
	
	switch (opção) {
	
	case 1: 
	A1 = N1.comerPrato1();
	
	System.out.printf("%s VOCÊ ESCOLHEU %s!\n", N1.nome,Pessoa.A.toUpperCase() );
	System.out.printf("APÓS A REFEIÇÃO SEU PESO SERÁ %.2f kg. ",A1 );
	
	
	
	break;	
	
	case 2: 
	B1 = N1.comerPrato2();
	System.out.printf("%s VOCÊ ESCOLHEU %s\n", N1.nome,Pessoa.B.toUpperCase());
	System.out.printf("APÓS A REFEIÇÃO SEU PESO SERÁ %.2f Kg.",B1 );
	break;	
    default:
		
	}
		
	entrada.close();
	
}
}
