package oo.composicao;

public class CarrpTest {
public static void main(String[] args) {
	
	Carro C1 = new Carro ();
	
	System.out.println(C1.estaLigado());
	C1.ligar();
	System.out.println(C1.estaLigado());
	System.out.println(C1.motor.giros());
	C1.acelerar();
	C1.acelerar();
	C1.acelerar();
	C1.acelerar();
	
	System.out.println(C1.motor.giros());
	
	C1.frear();
	C1.frear();
	C1.frear();
	C1.frear();
	
	//Faltou Encapsulamento!!!
	//C1.motor.fatorInjecao = 10;

	System.out.println(C1.motor.giros());
	
}
}
