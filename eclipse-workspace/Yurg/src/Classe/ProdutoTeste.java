package Classe;

public class ProdutoTeste {
public static void main(String[] args) {
	
	Produto P1 = new Produto ("Notebook", 4356.89, 0.25);

	Produto P2 = new Produto();
	P2.nome = "Caneta Preta";
	P2.preco = 12.56;
	P2.desconto = 0.25;
	
	System.out.println(P1.nome);
	System.out.println(P2.nome);

	double precoFinal1 = P1.precoComDesconto();
	double precoFinal2 = P2.precoComDesconto();
	double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
	System.out.printf("MEDIA DO CARRINHO = R$%.2f", mediaCarrinho);
	
	
	
}
}
