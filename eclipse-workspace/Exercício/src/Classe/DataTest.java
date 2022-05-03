package Classe;

public class DataTest {
public static void main(String[] args) {
	
	
	Data D1 = new Data ();{}
	Data D2 = new Data (1,1,1976);{}
	
	D1.dia = 10;
	D1.mes = 12;
	D1.ano = 2010;
	
	
	switch (D1.mes) {
	case 1:{System.out.printf("Dia %d de janeiro de %d", D1.dia, D1.ano);}
	break;
	case 2:{System.out.printf("Dia %d de fevereiro de %d", D1.dia, D1.ano);}
	break;
	case 3:{System.out.printf("Dia %d de março de %d", D1.dia, D1.ano);}
	break;
	case 4:{System.out.printf("Dia %d de abril de %d", D1.dia, D1.ano);}
	break;
	case 5:{System.out.printf("Dia %d de maio de %d", D1.dia, D1.ano);}
	break;
	case 6:{System.out.printf("Dia %d de junho de %d", D1.dia, D1.ano);}
	break;
	case 7:{System.out.printf("Dia %d de julho de %d", D1.dia, D1.ano);}
	break;
	case 8:{System.out.printf("Dia %d de agosto de %d", D1.dia, D1.ano);}
	break;
	case 9:{System.out.printf("Dia %d de setembro de %d", D1.dia, D1.ano);}
	break;
	case 10:{System.out.printf("Dia %d de outubro de %d", D1.dia, D1.ano);}
	break;
	case 11:{System.out.printf("Dia %d de novembro de %d", D1.dia, D1.ano);}
	break;
	case 12:{System.out.printf("Dia %d de dezembro de %d", D1.dia, D1.ano);}
	break;

		
	}
	
	switch (D2.mes) {
	case 1:{System.out.printf("\nDia %d de janeiro de %d", D2.dia, D2.ano);}
	break;
	case 2:{System.out.printf("\nDia %d de fevereiro de %d", D2.dia, D2.ano);}
	break;
	case 3:{System.out.printf("\nDia %d de março de %d", D2.dia, D2.ano);}
	break;
	case 4:{System.out.printf("\nDia %d de abril de %d", D2.dia, D2.ano);}
	break;
	case 5:{System.out.printf("\nDia %d de maio de %d", D2.dia, D2.ano);}
	break;
	case 6:{System.out.printf("\nDia %d de junho de %d", D2.dia, D2.ano);}
	break;
	case 7:{System.out.printf("\nDia %d de julho de %d", D2.dia, D2.ano);}
	break;
	case 8:{System.out.printf("\nDia %d de agosto de %d", D2.dia, D2.ano);}
	break;
	case 9:{System.out.printf("\nDia %d de setembro de %d", D2.dia, D2.ano);}
	break;
	case 10:{System.out.printf("\nDia %d de outubro de %d", D2.dia, D2.ano);}
	break;
	case 11:{System.out.printf("\nDia %d de novembro de %d", D2.dia, D2.ano);}
	break;
	case 12:{System.out.printf("\nDia %d de dezembro de %d", D2.dia, D2.ano);}
	break;


		
	}

var Data01 = D1.dataFormatacao();
var Data02 = D2.dataFormatacao();
System.out.println("\n"+Data01);
System.out.println(Data02);


}
}
