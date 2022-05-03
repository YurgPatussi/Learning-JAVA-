package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
public static void main(String[] args) {
	

	Aluno A1 = new Aluno ("Ana", 7.1);
	Aluno A2 = new Aluno ("Luna", 6.1);
	Aluno A3 = new Aluno ("Gui", 8.1);
	Aluno A4 = new Aluno ("Gabi", 10);
	
	List<Aluno> alunos = Arrays.asList(A1,A2,A3,A4);
	Predicate<Aluno> aprovado = a->a.nota>=7;
	Function<Aluno, Double> apenasNotas = a-> a.nota;
	BinaryOperator<Double> somatorio = (a,b)->a+b;
	
	alunos.parallelStream()
	.filter(aprovado)
	.map(apenasNotas)
	.reduce(somatorio)
	.ifPresent(System.out::println);
	
	
	
	
}}
