package Fundamentos;

public class Temperatura {
public static void main(String[] args) {
	
	double ajuste = 32;
	double razao = 5.0/9.0;// colocar "ponto" para valores com casa decimais
	
	
	
	double F = 86;
	double C = (F - ajuste) * razao;
	
	System.out.println("Temperatura ºC:" + C );
			
}
}
