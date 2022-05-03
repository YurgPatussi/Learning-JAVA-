package br.com.cod3r.cal.visao.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {


private enum TipoComando{
	ZERAR, NUMERO, DIV, MULT,SUB, IGUAL, VIRGULA, SOMA, INV;
}
private  static final Memoria instancia = new Memoria();
private TipoComando ultimaOperacao = null;
private String textoAtual = "";
private String textoBuffer= "";
private boolean substituir= false;

private List<MemoriaObservador> observadores = new ArrayList<MemoriaObservador>();

public String getTextoAtual() {
	return textoAtual.isEmpty() ? "0" : textoAtual;
}
private Memoria() {
		
	}
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObservador o) {
		observadores.add(o);
	}

public void processarComando(String valor) {
	TipoComando tipoComando = detectarTipoComando(valor);
	if (tipoComando == null) {
		return;
	}else if (tipoComando==TipoComando.ZERAR) {
		textoAtual="";
		textoBuffer="";
		substituir=false;
		ultimaOperacao=null;
	
	}
	else if (tipoComando==TipoComando.NUMERO || tipoComando==TipoComando.VIRGULA) {
		textoAtual= substituir ? valor : (textoAtual+valor);
		substituir = false;
	}else if (tipoComando == TipoComando.INV && textoAtual.contains("-")) {
	textoAtual = textoAtual.replace("-","");
	}else if (tipoComando == TipoComando.INV && !textoAtual.contains("-")) {
		textoAtual = "-"+textoAtual;
		}
	else {
		substituir = true;
		textoAtual = obterResultadoDaOperacao();
		ultimaOperacao = tipoComando;
		textoBuffer = textoAtual;
	}

	observadores.forEach(o->o.valorAlterado(getTextoAtual()));

}
private String obterResultadoDaOperacao() {
 if (ultimaOperacao==null || TipoComando.IGUAL == ultimaOperacao) {
		return textoAtual;	
	
	}
	double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
	double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
	
	double resultado=0;
	
	if (ultimaOperacao==TipoComando.SOMA) {
		resultado = numeroBuffer+numeroAtual;
	}	else if (ultimaOperacao==TipoComando.SUB) {
		resultado = numeroBuffer-numeroAtual;
	}	else if (ultimaOperacao==TipoComando.MULT) {
		resultado = numeroBuffer*numeroAtual;
	}	else if (ultimaOperacao==TipoComando.DIV) {
		resultado = numeroBuffer/numeroAtual;
	}
	
	String resultadoString = Double.toString(resultado).replace(".", ",");
	boolean inteiro = resultadoString.endsWith(",0");
	return inteiro ? resultadoString.replace(",0", "") : resultadoString;
}
private TipoComando detectarTipoComando (String valor) {
	if (textoAtual.isEmpty() && valor == "0") {
		return null;	
	}
	try {
		Integer.parseInt(valor);
		return TipoComando.NUMERO;
	} catch (NumberFormatException e) {
//Quando n�o for n�mero
	if ("AC".equals(valor)) {
		return TipoComando.ZERAR;
	}else if ("/".equals(valor)) {
		return TipoComando.DIV;
	}else if ("X".equals(valor)) {
		return TipoComando.MULT;
	}else if ("-".equals(valor)) {
		return TipoComando.SUB;
	}else if ("+".equals(valor)) {
		return TipoComando.SOMA;
	}else if (",".equals(valor) && !textoAtual.contains(",")) {
		return TipoComando.VIRGULA;
	}else if ("=".equals(valor)) {
		return TipoComando.IGUAL;
	
	}else if ("�".equals(valor)) {
		return TipoComando.INV;
	
	}
return null;
}}}






