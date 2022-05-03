package arrays;

import java.util.Arrays;


public class Exercicio {
public static void main(String[] args) {
	double [] notasAlunosA = new double [4];
	System.out.println(Arrays.toString(notasAlunosA));
	
	notasAlunosA [0] = 7.9;
	notasAlunosA [1] = 8;
	notasAlunosA [2] = 6.7;
	notasAlunosA [3] = 9.7;
	System.out.println(notasAlunosA[0]);
	System.out.println(notasAlunosA[notasAlunosA.length - 1]);
	System.out.println(Arrays.toString(notasAlunosA));
	
	double totalAlunoA = 0;
	for (int i = 0; i < notasAlunosA.length; i++) {
	totalAlunoA += notasAlunosA [i];	
	}
	System.out.println(totalAlunoA/notasAlunosA.length);

	double [] notasAlunosB = { 6.9, 8.9, 5.5, 10};
	
	double totalAlunoB = 0;

	for (int i = 0; i < notasAlunosB.length; i++) {
		totalAlunoB += notasAlunosB [i];	
	}

	System.out.println(totalAlunoB/notasAlunosB.length);
}

}
