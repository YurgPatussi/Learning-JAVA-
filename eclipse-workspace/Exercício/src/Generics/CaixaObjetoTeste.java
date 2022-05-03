package Generics;

public class CaixaObjetoTeste {
public static void main(String[] args) {
	
	CaixaObjetos caixaA = new CaixaObjetos();
	caixaA.aguardar(2.3);
 	
	Double coisaA = (Double)caixaA.abrir();
	System.out.println(coisaA);
	
	CaixaObjetos caixaB = new CaixaObjetos();
	caixaA.aguardar("Olá");
 	
	String coisaB = (String)caixaB.abrir();
	System.out.println(coisaB);
	
}
}
