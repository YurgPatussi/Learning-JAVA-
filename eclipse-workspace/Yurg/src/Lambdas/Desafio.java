package Lambdas;


import java.text.DecimalFormat;
import java.util.function.Function;


public class Desafio {

	public static void main(String[] args) {
	
		Double valorFinal;
		Produto P1 = new Produto("Notebook",4000, 0.05);
	
	Function<Produto, Double> Calculo = numero -> P1.preco>=2500 ? 
			(P1.preco *0.085)+(P1.preco*(1-P1.desconto)) : (P1.preco *0)+(P1.preco*(1-P1.desconto));
	
	Function <Double, Double> Frete = numero -> (P1.preco>=3000) ? 100.00 : 50.00; 

	valorFinal = Calculo.apply(P1);
	valorFinal += Frete.apply(P1.preco);
	
	
	DecimalFormat text = new DecimalFormat("0.00");
	String resultado = text.format(valorFinal);
	System.out.println("Valor total do produto: R$"+resultado);
	
		/*	
	 *1.A partir do produto calcular o preço real (com desconto);
	 *2. Imposto minicipal: >=2500 (8.5%) / < 2500 (Isento)
	 *3. Frete: >=3000 (100) / <3000 (50)
	 *4. Arredondar: Deixar duas casas decimais 
	 *5. Formatar: R$1234,56
	 */
	}

}
