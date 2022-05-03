package oo.composicao;

public class CursoTest {
public static void main(String[] args) {
	
	Aluno Aluno1 = new Aluno ("Yurg");
	Aluno Aluno2 = new Aluno ("Roberto");
	Aluno Aluno3 = new Aluno ("Maria");
	
	
	Curso Curso1 = new Curso ("JAVA");
	Curso Curso2 = new Curso ("MECATRÔNICA");
	Curso Curso3 = new Curso ("PORTUGUÊS");
	
	Curso1.adicionarAluno(Aluno1);
	Curso1.adicionarAluno(Aluno2);
	Curso2.adicionarAluno(Aluno3);
	Curso3.adicionarAluno(Aluno1);
	Curso3.adicionarAluno(Aluno2);
	Curso3.adicionarAluno(Aluno3);
	
	for (Aluno aluno : Curso1.alunos) {
	System.out.println(aluno.nome);
	}
	
	for (Aluno aluno : Curso2.alunos) {
	System.out.println(aluno.nome);
	}

	for (Aluno aluno : Curso3.alunos) {
	System.out.println(aluno.nome);
	}
	
	
	for (Curso cursos : Aluno1.cursos) {
		System.out.println(cursos.nome);
	}
	
	for (Curso cursos : Aluno2.cursos) {
		System.out.println(cursos.nome);
	}
	
	for (Curso cursos : Aluno3.cursos) {
		System.out.println(cursos.nome);
	}
}}
