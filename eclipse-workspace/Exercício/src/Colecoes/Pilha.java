package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
public static void main(String[] args) {
	Deque<String> livros = new ArrayDeque<String>();
	
	livros.add("O pequeno Príncipe");
	livros.push("Don Quixote");
	livros.push("O Hobbit");
	
	for (String Livro : livros ) {
		
		System.out.println(Livro);
	}
	
	
	System.out.println(livros.peek());
	System.out.println(livros.element());
	
	
	System.out.println(livros.size());
	System.out.println(livros.poll());
	System.out.println(livros.poll());
	System.out.println(livros.poll());
	System.out.println(livros.poll());
	
	
	
	//livros.size();
	//livros.clear();
	//livros.contains ();
	// livros.isEmpty
	
	for (String Livro : livros ) {
		
		System.out.println(Livro);
	}
}
}
