package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
public static void main(String[] args) {
	Aluno A1 = new Aluno ("Ana", 7.1);
	Aluno A2 = new Aluno ("Luna", 9);
	Aluno A3 = new Aluno ("Gui", 10);
	Aluno A4 = new Aluno ("Gabi", 10);
	
	List<Aluno> alunos = Arrays.asList(A1,A2,A3,A4);
	Predicate<Aluno> aprovado = a->a.nota>=7;
	Predicate<Aluno> reprovado = aprovado.negate();
	System.out.println(alunos.stream().allMatch(aprovado));
	System.out.println(alunos.stream().anyMatch(aprovado));
	System.out.println(alunos.stream().noneMatch(reprovado));
}
}
