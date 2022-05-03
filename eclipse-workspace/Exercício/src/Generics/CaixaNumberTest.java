package Generics;

public class CaixaNumberTest {
public static void main(String[] args) {
	
	CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
	caixaA.aguardar(2.566);
	System.out.println(caixaA.abrir());
	
	CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
	caixaB.aguardar(2566);
	System.out.println(caixaB.abrir());
		
	
}
}
