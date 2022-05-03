package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
	
Predicate <Produto> isCaro = prod -> prod.preco >=2000;

Produto produto = new Produto ("Notebook", 8900.98, 0.1);
System.out.println(isCaro.test(produto));
	}
}
