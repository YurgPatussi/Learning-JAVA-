package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno A1 = new Aluno ("Ana", 9);
		Aluno A2 = new Aluno ("Yurg", 9);
		Aluno A3 = new Aluno ("Gui", 10);
		Aluno A4 = new Aluno ("Gabi", 10);
		Aluno A5 = new Aluno ("Ana", 6.1);
		Aluno A6 = new Aluno ("Luna", 9);
		Aluno A7 = new Aluno ("Guii", 10);
		Aluno A8 = new Aluno ("Gabi", 10);
		
		
		List<Aluno> alunos = Arrays.asList(A1,A2,A3,A4,A5,A6,A7,A8);
		
		System.out.println("distinct...");
		alunos.stream()
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("nSkip/Limit");
		alunos.stream()
		.distinct()
		.limit(1)
		.skip(2)
		.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()
		.takeWhile(a->a.nota>=7)
		.forEach(System.out::println);
		
		

	}

}
