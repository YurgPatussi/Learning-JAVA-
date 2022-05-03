package arrays;

import java.util.Scanner;

public class DesafioArrays {
public static void main(String[] args) {
	int QTD;
	double total = 0;
	
	Scanner entrada= new Scanner (System.in);
	System.out.print("INFORME A QUANTIDADE DE NOTAS: ");
	QTD = entrada.nextInt();
	
	double [] A = new double [QTD];
	
	for (int i = 0; i < A.length ; i++)
	{
	 System.out.print("\nINFORME A NOTA " + (i+1) + ": ");
	 A[i]= (double) entrada.nextDouble();
	}
	
for (int i = 0; i < A.length; i++) {
	total+= A[i];
}
	
	System.out.println("\nMEDIA:" + (total / A.length));	
	
	entrada.close();
}
}
