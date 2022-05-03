package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
public static void main(String[] args) {
	Aluno A1 = new Aluno ("Ana", 6.1);
	Aluno A2 = new Aluno ("Luna", 9);
	Aluno A3 = new Aluno ("Gui", 10);
	Aluno A4 = new Aluno ("Gabi", 10);
	
	List<Aluno> alunos = Arrays.asList(A1,A2,A3,A4);
	Predicate<Aluno> aprovado = a->a.nota>=7;
	Function<Aluno, Double> apenasNotas = a-> a.nota;
	BiFunction<Media, Double, Media> calcularMedia =
			(media, nota)->media.adicionar(nota);
	BinaryOperator<Media> combinarMedia = (m1, m2)->Media.combinar(m1, m2);
	
	Media media= alunos.stream()
	.filter(aprovado)
	.map(apenasNotas)
	.reduce(new Media(),calcularMedia , combinarMedia);
	
	System.out.println("A média do aluno é "+ media.getValor());
}
}
