package oo.heranca;

public class Mostro extends Jogador {
	public Mostro (){
		super(0,0);
	}
	
	public Mostro (int x, int y){
		super(0,0);
	}
	
	public boolean atacar (Jogador oponente) {
		boolean atacar1 = super.atacar(oponente);
		boolean atacar2 = super.atacar(oponente);
		boolean atacar3 = super.atacar(oponente);
	return atacar1|| atacar2 || atacar3;
	}
	
}