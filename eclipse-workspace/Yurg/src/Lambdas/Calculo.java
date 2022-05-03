package Lambdas;
@FunctionalInterface
public interface Calculo {

	public double executar (double a, double b);
	
	default String Legal () {
		return "legal";
	}
	static String muitoLegal() {
		return "muito legal";
	}
	
}
