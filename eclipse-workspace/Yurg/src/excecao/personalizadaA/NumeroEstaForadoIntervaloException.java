package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroEstaForadoIntervaloException extends RuntimeException{
private String nomeDoAtributo;

	public NumeroEstaForadoIntervaloException (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessagem() {
		return String.format("O atributo %s está vazio", nomeDoAtributo);
	}
}
