package oo.composicao;

import java.util.ArrayList;

public class Compra {

String Cliente;
ArrayList <Item> Itens = new ArrayList <Item>();


void adicionarItem (Item item) {
	Itens.add(item);
	item.compra = this;
}
void adicionarItem (String nome, int Quantidade, double preço) {
	this.adicionarItem(new Item(nome, Quantidade, preço));
}

double obterValorTotal () {
	double total =0;
	for (Item item : Itens)
		{
		total += item.Quantidade * item.preço;
		}
		return total;


}
}
