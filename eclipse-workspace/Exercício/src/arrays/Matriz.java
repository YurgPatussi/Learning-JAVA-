package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);
	System.out.print("QUAL A QUANTIDADE DE ALUNOS:  \n");
	int qtdAlunos = entrada.nextInt();
	System.out.print("QUAL A QUANTIDADE DE NOTAS:  \n");
	int qtdNotas = entrada.nextInt();
	double [] [] Alunos = new double [qtdAlunos] [qtdNotas];
	double total=0;
	for (int A = 0; A < Alunos.length ; A++)
		for (int N = 0; N < Alunos[A].length;N++)
		{
			System.out.print("\nINFORME A NOTA " + (N+1) +" DO ALUNO " +
					(A+1) + ":");
			Alunos [A] [N]= entrada.nextDouble();
			total += Alunos[A][N];
		}
	
	System.out.println("MÉDIA DA TURMA: "+ (total/(qtdAlunos * qtdNotas) ));
	
	for ( double [] NotasdoAluno : Alunos)
	{
		System.out.println(Arrays.toString(NotasdoAluno));
	}
		entrada.close();
	
}
}
