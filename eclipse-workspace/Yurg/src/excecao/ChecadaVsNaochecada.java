package excecao;

public class ChecadaVsNaochecada {

	public static void main(String[] args) {
		geraErro1();
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println("Fim");
	}

	
	// Não checada ou verificada
	static void geraErro1(){
	throw	new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	// Excecão chacada ou verificada
	
	static void geraErro2()throws Exception{
	throw new Exception("Ocorreu um erro bem legal #02");
	}
}
