package Classe;

public class Pessoa {

	String nome;
	static String A = "Arroz";
	static String B = "Feijão";
	
	
	double peso;
	double soma;
	double soma1;
	
	Pessoa (String nome, double peso){
	this.nome = nome;
	this.peso = peso;	
	}
	
	double comerPrato1 () {
		
	Comida C1 = new Comida(A, B, 0.3, 0.2){};
	soma = C1.pesoComida1 + peso;
	return soma;

		}
			
	double comerPrato2 () {
	
	Comida C2 = new Comida(A, B, 0.3, 0.2){};
	soma1 = C2.pesoComida2 + peso;
	return soma1;

	}
	
}
