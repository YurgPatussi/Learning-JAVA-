package oo.polimorfismo;

public class Jantar {
public static void main(String[] args) {
	
	
	Pessoa convidado1 = new Pessoa (100.0);
	
	Comida ingrediente1 = new Arroz (0.200);
	Comida ingrediente2 = new Feijao (0.100);
	convidado1.Comer(ingrediente1);
	convidado1.Comer(ingrediente2);	
	System.out.println(convidado1.getPeso());
	Comida sobremesa = new Sorvete(0.400);
	
	convidado1.Comer(sobremesa);	
	
	System.out.println(convidado1.getPeso());
}
}
