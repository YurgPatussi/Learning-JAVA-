package Classe;

public class Data {

	
	int dia;
	int mes;
	int ano;
	
String dataFormatacao ()
	{
		
	String simbolo = "%d/%d/%d";
	return String.format(simbolo, this.dia, this.mes, this.ano);
		
	}

Data (){
	//dia = 1;
	//mes = 1;
	//ano = 1976;
   this(1,1,1976);

}

Data (int dia, int mes, int ano)
{
this.dia = dia;
this.mes = mes;
this.ano = ano;
}
}
