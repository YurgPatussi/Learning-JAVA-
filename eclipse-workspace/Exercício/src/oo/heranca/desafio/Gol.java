package oo.heranca.desafio;

public class Gol extends Carro implements Esportivo, Luxo {

	
private boolean ligarTurbo;
private boolean ligarAr;	


	
	public Gol (){
		super(300);
	}
	

	
	public boolean Acelerar (Carro acelerar) 
	{
boolean A = super.Acelerar(acelerar);
boolean B = super.Acelerar(acelerar);	
boolean C = super.Acelerar(acelerar);

return A || B || C;}

@Override
public void ligarTurbo() {
	ligarTurbo = true;
	
}
@Override
public void desligarTurbo() {
	ligarTurbo = false;}

@Override
public void ligarAr() {
	ligarAr=true;
}

@Override
public void desligarAr() {
	ligarAr=false;
}

public int getDelta() 
{
	if (ligarTurbo && !ligarAr) {
		return 35;} 
	else if (ligarTurbo && ligarAr) {
		return 25;}
		
	else if (!ligarTurbo && ligarAr) {
			return 15;
	}
	return 10;

}
}

