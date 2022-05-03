package Classe;

public class Desconto {

String produto;
double preco;
static double desconto = 0.25;

Desconto (String nome, double valor) {
	produto = nome;
	preco = valor;
}

double Calculo ()
{
	return preco * (1- desconto);
}

}

