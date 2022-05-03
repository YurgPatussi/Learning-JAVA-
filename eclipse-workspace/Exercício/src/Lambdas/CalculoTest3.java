package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTest3 {
public static void main(String[] args) {
	
	
	// Não: int -> Double;
	
	
	BinaryOperator<Double> calc = (x, y) -> {return x + y;};
	
	System.out.println(calc.apply(2.0, 3.0));
	
	calc = (x , y)-> x * y;
	
	System.out.println(calc.apply(2.0, 3.0));
	
	BinaryOperator<Integer> calc1 = (x, y) -> {return x + y;};
	
	System.out.println(calc1.apply(2, 3));
	
	calc1 = (x , y)-> x * y;
	
	System.out.println(calc1.apply(2, 3));


}
}
