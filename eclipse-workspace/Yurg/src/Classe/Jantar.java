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
	
	System.out.printf("OL� %s, FAVOR INFORMAR SEU PESO: \n", X);
	double Y = entrada.nextDouble();
    
	System.out.println("QUAL PRATO VOC� GOSTARIA: \n"
			+ "[1] ARROZ\n[2] FEIJ�O\n");
	int op��o = entrada.nextInt();
	
	Pessoa N1 = new Pessoa (X,Y); {}
	
	switch (op��o) {
	
	case 1: 
	A1 = N1.comerPrato1();
	
	System.out.printf("%s VOC� ESCOLHEU %s!\n", N1.nome,Pessoa.A.toUpperCase() );
	System.out.printf("AP�S A REFEI��O SEU PESO SER� %.2f kg. ",A1 );
	
	
	
	break;	
	
	case 2: 
	B1 = N1.comerPrato2();
	System.out.printf("%s VOC� ESCOLHEU %s\n", N1.nome,Pessoa.B.toUpperCase());
	System.out.printf("AP�S A REFEI��O SEU PESO SER� %.2f Kg.",B1 );
	break;	
    default:
		
	}
		
	entrada.close();
	
}
}
