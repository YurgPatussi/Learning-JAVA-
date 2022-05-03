package Generics;

public class CaixaTest {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<String>();
		caixaA.aguardar("Oi");
		System.out.println(caixaA.abrir());
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.aguardar(9.98);
		System.out.println(caixaB.abrir());
	}
}
