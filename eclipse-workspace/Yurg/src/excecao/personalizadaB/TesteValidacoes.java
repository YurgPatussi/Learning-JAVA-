package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
public static void main(String[] args) {
	
	try {
		Aluno aluno = new Aluno ("Ana",-7);
		Validar.aluno(aluno);
	}
	catch (StringVaziaException e) 
	{	
	System.out.println(e.getMessage());
	
}
	catch (NumeroEstaForadoIntervaloException e) 
	{	
	System.out.println(e.getMessagem());
	
}
	System.out.println("Fim:)");
}
}
