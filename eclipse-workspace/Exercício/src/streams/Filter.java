package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

public static void main(String[] args) {
		
	Aluno A1 = new Aluno ("Yurg", 7.8);
	Aluno A2 = new Aluno ("Eduardo", 5.8);
	Aluno A3 = new Aluno ("Patussi", 9.8);
	Aluno A4 = new Aluno ("Daniel", 9.8);
	Aluno A5 = new Aluno ("Gui", 7.0);
	Aluno A6 = new Aluno ("Pedro", 8.8);
	
	Predicate<Aluno> aprovado = Aluno ->Aluno.nota>=7.0;
	Function<Aluno, String> saudaçãoAprovado = A -> "Parabéns " + A.nome + "! Você foi aprovado.";
	List<Aluno> alunos = Arrays.asList(A1,A2,A3,A4,A5,A6);
	
	alunos.stream()
	.filter(aprovado)
	.map(saudaçãoAprovado)
	.forEach(System.out::println);
	
}}
