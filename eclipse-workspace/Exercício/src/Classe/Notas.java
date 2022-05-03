package Classe;

public class Notas {

	
	double Nota1;
	double Nota2;
	double Nota3;
	double X;

	Notas (double Nota1, double Nota2, double Nota3) {
	
	this.Nota1 = Nota1;
	this.Nota2 = Nota2;
	this.Nota3 = Nota3;	
	}

	double Media ()
	{
	
		X = (Nota1 + Nota2 + Nota3)/3;
		return X;
	}
}