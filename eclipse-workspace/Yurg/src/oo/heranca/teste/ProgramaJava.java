package oo.heranca.teste;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Gol;

public class ProgramaJava {
public static void main(String[] args) {
	
Gol gol = new Gol ();

Civic civic = new Civic ();
gol.ligarTurbo();
gol.ligarAr();
gol.Acelerar(gol);
gol.Acelerar(gol);


civic.Acelerar(civic);
civic.Acelerar(civic);
civic.Acelerar(civic);
civic.Acelerar(civic);
civic.Acelerar(civic);


System.out.println("Velocidade do GOL: " + gol.V1 + "Km/h");
System.out.println("Velocidade do CIVIC: " + civic.V1 + "Km/h");

gol.Frear(gol);
gol.Frear(gol);
civic.Frear(civic);
civic.Frear(civic);

System.out.println("Velocidade do GOL: " + gol.V1 + "Km/h");
System.out.println("Velocidade do CIVIC: " + civic.V1 + "Km/h");

gol.Frear(gol);
gol.Frear(gol);
civic.Frear(civic);
civic.Frear(civic);
System.out.println(gol.nivelAr());

}
}
