package oo.encapsulamento;

public class Pessoa {


	private int idade;
	private String nome;
	
	
	public Pessoa (int idade, String nome){
	setIdade(idade);
	setNome(nome);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		
		if (idade  >=0 && idade <= 120) 
		{
		this.idade = idade;
		}
	}
	public String getNome ()
	{
		return nome;
	}
	public void setNome (String nome) {
		
		this.nome = nome;
	}

	}
	

