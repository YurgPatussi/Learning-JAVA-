package oo.composicao.Other;

import java.util.ArrayList;
import java.util.List;

public class Compra {
List<Item> itens = new ArrayList<Item>();

void adicionarItem (String nome, int Qtd, double preco) {
	itens.add(new Item(new Produto(nome, preco), Qtd));
}


double somaTotalItem () {
double total=0;

for (Item d : itens) {
	total+= d.Qtd*d.produto.preco;}
return total;
}}
