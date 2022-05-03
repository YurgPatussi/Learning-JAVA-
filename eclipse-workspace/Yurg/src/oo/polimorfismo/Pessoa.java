package oo.polimorfismo;

public class Pessoa {

	private double peso;

	
	Pessoa (double peso){
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	 void Comer (Comida comida)
	{
		this.peso += comida.getPeso();
	}
}
