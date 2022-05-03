package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	Queue <String> fila = new LinkedList<String>();
	
	
	// Offter e Add -> adicionam elemento na fila
	// Diferen�a �o comportamento quando a fila est� cheia!
	fila.add("Yurg"); // retorna false
	fila.offer("Eduardo"); // lan�a uma exce��o
	fila.offer("Patussi");
	fila.offer("Maria");
	fila.offer("Mayara");
	
	// Peek e Element --> obter o pr�ximo elementos
	// da fila (sem remover)
	
	//Diferen�a � o comportamento ocorre 
	// quando a fila estpa vazia!
	
	System.out.println(fila.peek()); // return false
	System.out.println(fila.peek()); // return false
	System.out.println(fila.element()); // Lan�a uma exce��o
	System.out.println(fila.element()); // Lan�a uma exce��o


	
	
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
