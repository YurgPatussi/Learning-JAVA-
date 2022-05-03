package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;



public class DesafioResposta {

	public static void main(String[] args) {
		/*	
		 *1.A partir do produto calcular o preço real (com desconto);
		 *2. Imposto minicipal: >=2500 (8.5%) / < 2500 (Isento)
		 *3. Frete: >=3000 (100) / <3000 (50)
		 *4. Arredondar: Deixar duas casas decimais 
		 *5. Formatar: R$1234,56
		 */
		Produto P1 = new Produto ("Notebook", 2873.87, 0.1);
		
		Function<Produto, Double> desconto = P -> 
		P.preco* (1-P.desconto);
		
		UnaryOperator<Double> Imposto = Preco -> 
		Preco >=2500 ? Preco * 1.085 : Preco;
		
		UnaryOperator<Double> Frete = Preco -> 
		Preco>=3000 ? Preco + 100 : Preco+50;
		
		//UnaryOperator<Double> arredondamento = preco -> 
		//Double.parseDouble(String.format("%.2f", preco));
		
		
		Function<Double, String> formatar = preco -> 
		("R$" + preco).replace(".",",");
		
	
		 String P = desconto
			.andThen(Imposto)
			.andThen(Frete)
			//.andThen(arredondamento)
			.andThen(formatar)
			.apply(P1);
			System.out.println(P);		
		System.out.println("O preço é " + P);
		

	}

}
