package oo.polimorfismo;

public abstract class Comida {

	private double peso;
	double P1;
	
	Comida (double peso)
	{
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

}
