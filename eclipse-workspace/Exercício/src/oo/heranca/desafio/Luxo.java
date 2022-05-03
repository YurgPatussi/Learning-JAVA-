package oo.heranca.desafio;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	default int nivelAr()
	{
	return 1;
	}
}
