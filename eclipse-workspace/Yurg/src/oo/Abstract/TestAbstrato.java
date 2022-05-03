package oo.Abstract;

public class TestAbstrato {
public static void main(String[] args) {
	
	
	Animal A = new Mamifero ();
	
	System.out.println(A.mamar());
	System.out.println(A.mover());
	
	System.out.println(A.repirar());

}
}
