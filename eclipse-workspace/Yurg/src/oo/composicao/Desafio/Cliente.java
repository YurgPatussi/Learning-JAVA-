package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
String nomeCliente;


List<Compra> compras = new ArrayList<Compra>();
double total = 0;
double obterValorTotal () {
	
	for (Compra compras : compras)
	
	total+= compras.obterValorTotal();
    return total;
    }

Cliente (String nomeCliente){
	
	this.nomeCliente = nomeCliente;
}
}

