package Lambdas;

public class CalculoTest {
public static void main(String[] args) {
	
	
	Calculo soma = new Somar ();
	Calculo multiplicação = new Multiplicar();
	
	System.out.println(soma.executar(2, 3));
	System.out.println(multiplicação.executar(2, 3));
	
}
}
