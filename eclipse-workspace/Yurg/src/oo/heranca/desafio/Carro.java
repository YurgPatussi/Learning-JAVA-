package oo.heranca.desafio;

public class Carro {

	int VELOCIDADEMAXIMA;
	public int V1 =0;	
	private int delta=10;

public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}


public Carro (int VELOCIDADEMAXIMA){
	this.VELOCIDADEMAXIMA=VELOCIDADEMAXIMA;
}


public boolean Acelerar (Carro acelerar) {
	if ((V1 >= 0 && VELOCIDADEMAXIMA > V1)) 
	{
		V1+= getDelta();
	}
return false;
}

public boolean Frear (Carro frear) {

	if (V1 > 0) {
		V1-=5;
}return false;
	}}
