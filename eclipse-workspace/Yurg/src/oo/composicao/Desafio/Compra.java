package oo.composicao.Desafio;
import java.util.ArrayList;
import java.util.List;

public class Compra {

List<Item> itens = new ArrayList<>();
	
void adicionarItem (Produto p, int quantidade) {
this.itens.add(new Item (p, quantidade));

}
double total = 0;
double obterValorTotal () {
	
	for (Item itens : itens)
		
		total+= itens.produto.preco * itens.Qtd;
	    return total;
}
 void adicionarItem (String nome, double preco, int qtd) {
	this.itens.add(new Item (new Produto(preco, nome), qtd)) ;
 }
}




	

