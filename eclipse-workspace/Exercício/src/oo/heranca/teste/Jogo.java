package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Mostro;

public class Jogo {
public static void main(String[] args) {
	
	Heroi Heroi1 = new Heroi ();
	Heroi1.x=10;
	Heroi1.y=10;
	
	Mostro Mostro1 = new Mostro ();
	Mostro1.x=10;
	Mostro1.y=11;
	
	
	
	System.out.println("Herói tem => " + Heroi1.vida);
	System.out.println("Mostro tem =>"+ Mostro1.vida);
	
	Heroi1.atacar(Mostro1);
	Heroi1.atacar(Mostro1);
	Mostro1.atacar(Heroi1);
	Mostro1.atacar(Heroi1);
	
	System.out.println("Herói tem => " + Heroi1.vida);
	System.out.println("Mostro tem =>"+ Mostro1.vida);

	
}
}
