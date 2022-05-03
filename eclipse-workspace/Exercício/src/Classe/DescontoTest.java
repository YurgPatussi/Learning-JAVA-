package Classe;

public class DescontoTest {
public static void main(String[] args) {
	
	
	Desconto.desconto = 0.50;
	
	
	Desconto a1 = new Desconto ("Caneta", 5);
	Desconto a2 = new Desconto ("Lapis", 2);
	Desconto a3 = new Desconto ("Carro", 1000);
	
	
	
	System.out.println(a1.produto + ":R$"+ a1.Calculo());
	System.out.println(a2.produto + ":R$"+ a2.Calculo());
	System.out.println(a3.produto + ":R$"+ a3.Calculo());
	
	System.out.printf("\n %s está com R$ %.2f de desconto.", a1.produto, a1.Calculo());
	System.out.printf("\n %s está com R$ %.2f de desconto.", a2.produto, a2.Calculo());
	System.out.printf("\n %s está com R$ %.2f de desconto.", a3.produto, a3.Calculo());
}
}
