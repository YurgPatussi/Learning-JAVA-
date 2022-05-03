package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class DesafioResposta {
public static void main(String[] args) {
	
Desafio P1 = new Desafio ("Notebook", 2000, 0.3);
Desafio P2 = new Desafio ("Caderno", 20, 0.4);
Desafio P3 = new Desafio ("TV", 4000, 0.2);
Desafio P4 = new Desafio ("Caneta", 2, 0.5);
Desafio P5 = new Desafio ("Perfume", 500, 0.3);
Desafio P6 = new Desafio ("Roupa", 100, 0.3);


List<Desafio> Compra = Arrays.asList(P1,P2,P3,P4,P5,P6);

Predicate<Desafio> Valor = V -> V.preco >= 300;
Predicate<Desafio> Desconto = D -> D.desconto>=0.2;
Function<Desafio, String> print =  p-> "O " + p.nome + " está com " + 
(p.desconto*100)+"% de desconto --> Valor do produto oom desconto R$"+(p.preco*(1-p.desconto));


Compra.stream()
.filter(Valor)
.filter(Desconto)
.map(print)
.forEach(System.out::println);

	
	
	
	
	
	
	
	
}
}
