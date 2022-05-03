package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	Queue <String> fila = new LinkedList<String>();
	
	
	// Offter e Add -> adicionam elemento na fila
	// Diferença éo comportamento quando a fila está cheia!
	fila.add("Yurg"); // retorna false
	fila.offer("Eduardo"); // lança uma exceção
	fila.offer("Patussi");
	fila.offer("Maria");
	fila.offer("Mayara");
	
	// Peek e Element --> obter o próximo elementos
	// da fila (sem remover)
	
	//Diferença é o comportamento ocorre 
	// quando a fila estpa vazia!
	
	System.out.println(fila.peek()); // return false
	System.out.println(fila.peek()); // return false
	System.out.println(fila.element()); // Lança uma exceção
	System.out.println(fila.element()); // Lança uma exceção


	
	
// fila.size();
// fila.clear();
// fila.isEmpty ();
	
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	
	
	
	
	
	

}
}
