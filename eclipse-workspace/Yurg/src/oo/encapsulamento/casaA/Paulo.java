package oo.encapsulamento.casaA;

public class Paulo {

	//@SuppressWarnings("unused")
	//private String segredo = "...";
	//String focoDentroDeCasa = "..."; // default ou pacote
	//protected String formaDeFalar = "...";
	//public String todosSabem = "...";
	
	Ana esposa = new Ana ();
	
	void testeAcessos () {
	
	//segredo
	//focoDentroDeCasa
	//formaDeFalar
	//todosSabem 
		
	System.out.println(esposa.focoDentroDeCasa);	
	System.out.println(esposa.formaDeFalar);	
	System.out.println(esposa.focoDentroDeCasa);	
	System.out.println(esposa.todosSabem);	
	}
}
