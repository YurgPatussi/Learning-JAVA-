package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
public static void main(String[] args) {
	
	Map<Integer, String > usuarios =new HashMap<Integer, String>();
	usuarios.put(1, "Roberto");
	usuarios.put(2, "Yurg");
	usuarios.put(3, "Patussi");
	usuarios.put(4, "Mayara");
	
	System.out.println(usuarios.size());
	System.out.println(usuarios.isEmpty());
	System.out.println(usuarios.keySet());
	
	System.out.println(usuarios.values());
	System.out.println(usuarios.entrySet());
	
	System.out.println(usuarios.containsKey(1));
	System.out.println(usuarios.containsValue("Mayara"));
	
	for (int Usuario : usuarios.keySet()) {
		System.out.println(Usuario);
	}
	
	
	for (String Valor : usuarios.values()) {
		System.out.println(Valor);
	}
	
	for(Entry <Integer, String> Registro : usuarios.entrySet())
	{
		System.out.print(Registro.getKey()+" - ");
		System.out.println(Registro.getValue());
	}
	usuarios.remove(3);
	usuarios.remove(4);
	System.out.println("\n\n");
	for(Entry <Integer, String> Registro : usuarios.entrySet())
	{
		System.out.print(Registro.getKey()+" - ");
		System.out.println(Registro.getValue());
}

}}
