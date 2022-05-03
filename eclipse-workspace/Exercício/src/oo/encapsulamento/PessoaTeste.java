package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
	
	Pessoa P1 = new Pessoa(27, "Yurg");
	Pessoa P2 = new Pessoa(24, "Mayara");
	
	System.out.println("Meu nome é " + P1.getNome() + " e tenho " + P1.getIdade() + " idade");
	System.out.println("Meu nome é " + P2.getNome() + " e tenho " + P2.getIdade() + " idade");

	
}
}
