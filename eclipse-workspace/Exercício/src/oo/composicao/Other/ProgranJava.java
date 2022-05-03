package oo.composicao.Other;

public class ProgranJava {
public static void main(String[] args) {
	
	Compra compra1 = new Compra();
	compra1.adicionarItem("Caderno", 2, 10);
	compra1.adicionarItem("Lapis", 2, 10);
	
	Compra compra2 = new Compra();
	compra2.adicionarItem("Caneta", 2, 5);
	compra2.adicionarItem("Borracha", 2, 5);
	
	
	Cliente cliente1 = new Cliente("Yurg");
	cliente1.compras.add(compra1);
	cliente1.compras.add(compra2);
	
	System.out.println(cliente1.obterValorTotal());
	
}
}
