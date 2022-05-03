package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class ImprimindoObjetos {
public static void main(String[] args) {
	
	List<String> Aprovados = Arrays.asList("Ana","Luca","Gui");

for (int i=0; i<Aprovados.size(); i++ ) {
	System.out.println(Aprovados.get(i));
}

	System.out.println("Usando Foreach...");
	
for (String nome : Aprovados) {
	System.out.println(nome);
}

System.out.println("Usando Iterator...");
Iterator<String> it = Aprovados.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}


Stream<String> stream = Aprovados.stream();
stream.forEach(System.out::println);
}
}
