package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroEstaForadoIntervaloException extends Exception{
private String nomeDoAtributo;

	public NumeroEstaForadoIntervaloException (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessagem() {
		return String.format("O atributo %s está vazio", nomeDoAtributo);
	}
}
