package Classe;

public class ValorVsReferencia {
public static void main(String[] args) {
	double a = 2;
	double b = a; // atribuição por valor (Tipo primitivo)
	
	a++;
	b--;
	
	System.out.println(a + " " +b);
	
	Data d1 = new Data(01, 01, 1996);
	Data d2 = d1; //Atribuição por referência (Objeto)
	
	d1.dia = 2;
	d2.mes = 12;
	d1.ano = 2020;
	
	System.out.println(d1.dataFormatacao());
	System.out.println(d2.dataFormatacao());

	voltarparaovalornormal(d1);
	
	System.out.println(d1.dataFormatacao());
	System.out.println(d2.dataFormatacao());
	
}	

static void voltarparaovalornormal(Data d)
{
d.dia = 01;
d.mes = 01;
d.ano = 1996;
}
}
