package oo.composicao.Other;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

String nomeCliente;

List<Compra> compras = new ArrayList<Compra>();

Cliente(String nome){
	this.nomeCliente = nome;
}

double total;
double obterValorTotal (){
	for (Compra compras : compras)
	total+= compras.somaTotalItem();	
	return total;
}
}
