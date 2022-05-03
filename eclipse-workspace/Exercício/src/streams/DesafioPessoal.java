package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class DesafioPessoal {
public static void main(String[] args) {
	
	
	
	testHouse T1 = new testHouse("Dimensinal", 12345678,false ,false);
	testHouse T2 = new testHouse("Gauge Check", 87654321, false,false);
	testHouse T3 = new testHouse("RR", 00000000,true ,true);
	testHouse T4 = new testHouse("Contact", 11111111,true ,true);
	testHouse T5 = new testHouse("GP", 10101010,false ,false);
	
	List<testHouse> testes = Arrays.asList(T1,T2,T3,T4,T5);
	
	Predicate<testHouse> Status = t->t.status;
	Predicate<testHouse> Resultado = t->t.resultado;
	Function<testHouse, String> print = p-> "O teste de " + p.nomeTest +" barcode:" + Integer.toString((p.barcode))+ " está APROVADO";
	
	testes.stream()
	.filter(Status)
	.filter(Resultado)
	.map(print)
	.forEach(System.out::println);
	
}
}
