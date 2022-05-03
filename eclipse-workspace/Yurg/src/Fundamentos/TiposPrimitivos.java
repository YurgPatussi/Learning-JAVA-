package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
	//informação de um funcionário
	// Números inteiros
		
		byte anosdeempresa = 127;
		short numeroDeVoos = 542;
		int id = 52789;
		long pontosAcumulados = 3_134_845_233L; // "L" para definir um literal long.
		float salario = 11_445.44F;
		double vendaAcumuladas = 2_991_797_103.01;
		boolean estadeferias = false;
		char status = 'A';
		System.out.println(anosdeempresa*365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados/vendaAcumuladas);
		System.out.println(id + ": ganha -->" + salario);
		System.out.println("Ferias?" + estadeferias);
		System.out.println("Status: " + status);
			
	
	}
}
