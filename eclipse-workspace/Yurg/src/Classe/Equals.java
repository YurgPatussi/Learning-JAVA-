package Classe;

public class Equals {
public static void main(String[] args) {
	
	Usuario U1 = new Usuario ();
	U1.Nome = "Yurg Eduardo Patussi";
	U1.Email = "Yurgeduardo@gmail.com";
	
	Usuario U2 = new Usuario ();
	U2.Nome = "Yurg Eduardo Patussi";
	U2.Email = "Yurgeduardo@gmail.com";
	
	
	System.out.println(U1 == U2);
	System.out.println(U1.equals(U2));
	System.out.println(U2.equals(U1));
	System.out.println(U1.Nome == U2.Nome);
	System.out.println(U1.Email == U2.Email);
}
}
