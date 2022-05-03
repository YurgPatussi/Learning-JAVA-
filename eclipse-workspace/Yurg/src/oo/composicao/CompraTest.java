package oo.composicao;

public class CompraTest {
public static void main(String[] args) {
	
	Compra Compra1 = new Compra ();
	Compra1.Cliente = "Yurg Eduardo Patussi";
	
	Compra1.adicionarItem("Caderno", 2,2.0);
	Compra1.adicionarItem("Macarrão", 2,2.0);
	Compra1.adicionarItem("Pão", 5,9.0);
	Compra1.Itens.add(new Item("Banana", 4, 10));
	Compra1.Itens.add(new Item("Caderno", 4, 10));
	
	System.out.println(Compra1.Itens.size());
	System.out.println(Compra1.obterValorTotal());
}
}
