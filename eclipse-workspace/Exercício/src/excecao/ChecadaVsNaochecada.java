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

	
	// N�o checada ou verificada
	static void geraErro1(){
	throw	new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	// Excec�o chacada ou verificada
	
	static void geraErro2()throws Exception{
	throw new Exception("Ocorreu um erro bem legal #02");
	}
}
