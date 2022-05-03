package Generics;

public class ParesTest {
public static void main(String[] args) {
	
	Pares <Integer, String> resultadoConcurso = new Pares<>();
	resultadoConcurso.adicionar(1, "Yurg");
	resultadoConcurso.adicionar(2, "Eduardo");
	resultadoConcurso.adicionar(3, "Patussi");
	resultadoConcurso.adicionar(4, "Mayara");
	resultadoConcurso.adicionar(5, "Roberto");
	resultadoConcurso.adicionar(2, "Maria");
	
	
	System.out.println(resultadoConcurso.getValor(1));
	System.out.println(resultadoConcurso.getValor(2));
}
}
