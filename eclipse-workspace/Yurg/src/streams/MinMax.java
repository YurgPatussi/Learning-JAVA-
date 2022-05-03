package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno A1 = new Aluno ("Ana", 6.1);
		Aluno A2 = new Aluno ("Luna", 9);
		Aluno A3 = new Aluno ("Gui", 10);
		Aluno A4 = new Aluno ("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(A1,A2,A3,A4);
		
		Comparator<Aluno> melhorNota = (Aluno1, Aluno2)-> {
			if (Aluno1.nota>Aluno2.nota) return 1;
			if (Aluno1.nota< Aluno2.nota) return -1;
			return 0;
		
		};
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());

	}

}
