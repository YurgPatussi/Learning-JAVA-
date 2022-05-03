package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
public static void main(String[] args) {
	
	
	Consumer<Produto> imprimir = p -> System.out.println (p.nome + "!!!");
	Produto p1= new Produto("Caneta", 12.94,0.09);
	Produto p2= new Produto("Caderno", 10,0.1);
	Produto p3= new Produto("Notebook", 1900,0.3);
	Produto p4= new Produto("Lapis", 20,0.09);
	imprimir.accept(p1);
	
	List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
	
	
	produtos.forEach(imprimir);
	
	produtos.forEach(p->System.out.println(p.preco));
	produtos.forEach(System.out::println);
	
	
}
}
