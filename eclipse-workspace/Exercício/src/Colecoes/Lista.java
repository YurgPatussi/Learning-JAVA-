package Colecoes;

import java.util.ArrayList;

public class Lista 
{
	public static void main(String[] args) {
		ArrayList<Usuario> Lista = new ArrayList <>();
		{
		Usuario U1 = new Usuario ("Yurg");
		Lista.add(U1);
		Lista.add(new Usuario ("Eduardo"));
		Lista.add(new Usuario ("Mayara"));
		Lista.add(new Usuario ("Roberto"));
		Lista.add(new Usuario ("Maria"));
		
		
		
		for (Usuario u : Lista)
		{
		System.out.println(u.Nome);
		}
		
		System.out.println("--->"+Lista.get(2).Nome);
		System.out.println("--->"+Lista.get(2).toString());

		Lista.remove(3);
		Lista.remove(new Usuario ("Yurg"));
		
		System.out.println(Lista.contains(new Usuario ("Maria")));
		
		for (Usuario u : Lista)
		{
		System.out.println(u.Nome);
		}
		
		
		}
		
		
		
		
	}
}
