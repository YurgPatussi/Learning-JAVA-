package arrays;

public class Foreach {
public static void main(String[] args) {
	
	double [] notas = {9.7, 8.0, 6.9, 10};
	
	for (int i = 0; i < notas.length ; i++) {
		System.out.println(notas[i]);
	}
	
	for (double A : notas) {
		System.out.println(A);
	}
	
	
}
}
