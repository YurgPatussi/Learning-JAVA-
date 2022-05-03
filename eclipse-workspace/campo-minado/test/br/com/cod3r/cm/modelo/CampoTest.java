package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.ExplosaoException;

class CampoTest {

	private Campo campo;
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo (3,3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo (3,2);
		boolean resultado = campo.adicionarVizinhos(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo (3,4);
		boolean resultado = campo.adicionarVizinhos(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDistancia1Acima() {
		Campo vizinho = new Campo (2,3);
		boolean resultado = campo.adicionarVizinhos(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDistancia1Abaixo() {
		Campo vizinho = new Campo (4,3);
		boolean resultado = campo.adicionarVizinhos(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhodiagonal() {
		Campo vizinho = new Campo (2,2);
		boolean resultado = campo.adicionarVizinhos(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhodiagonal1() {
		Campo vizinho = new Campo (1,1);
		boolean resultado = campo.adicionarVizinhos(vizinho);
		assertFalse(resultado);
	}
	@Test
	void testeValorPadraoAtributoMarcado() {
	assertFalse(campo.isMarcado());
}
	@Test
	void testealternarMarcacao() {
	campo.alternarMarcacao();
	assertTrue(campo.isMarcado());
}
	@Test
	void testealternarMarcacaoDuasChamadas() {
	campo.alternarMarcacao();
	campo.alternarMarcacao();
	assertFalse(campo.isMarcado());
}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
	assertTrue(campo.abrir());
}
	@Test
	void testeAbrirNaoMinadoMarcado() {
	campo.alternarMarcacao();
	assertFalse(campo.abrir());
}
	
	@Test
	void testeAbrirMinadoMarcado() {
	campo.minar();
	campo.alternarMarcacao();
	assertFalse(campo.abrir());
}
	@Test
	void testeAbrirMinadoEnaoMarcado() {
	campo.minar();
	assertThrows(ExplosaoException.class, ()->{campo.abrir();});
}
	@Test
	void testeAbriComVizinhos() {
	Campo campo11 = new Campo (1,1);
	Campo campo22 = new Campo (2,2);	
	campo22.adicionarVizinhos(campo11);
	campo.adicionarVizinhos(campo22);
	
	campo.abrir();
	assertTrue(campo22.isAberto()&&campo11.isAberto());
	
	}
	@Test
	void testeAbriComVizinhos2() {
	Campo campo11 = new Campo (1,1);
	Campo campo12 = new Campo (1,1);
	campo12.minar();
	Campo campo22 = new Campo (2,2);	
	campo22.adicionarVizinhos(campo11);
	campo22.adicionarVizinhos(campo12);
	campo.adicionarVizinhos(campo22);
	
	campo.abrir();
	assertTrue(campo22.isAberto()&&campo11.isFechado());
	
	}
	
	@Test
	void testToString () {
		Campo campo11 = new Campo (1,1);
		campo11.abrir();
		campo11.minar();
		campo11.alternarMarcacao();
		campo11.toString();
		System.out.println(campo11.toString());
	
		
	}
	@Test
	void testToString1 () {
		Campo campo11 = new Campo (1,1);
		campo11.alternarMarcacao();
		campo11.toString();
		System.out.println(campo11.toString());
	
		
	}
	@Test
	void testToString2 () {
		Campo campo11 = new Campo (1,1);
		campo11.isAberto();
		campo11.minar();
		campo.adicionarVizinhos(campo11);
		campo.minasNaVizinhanca();
		campo11.toString();
		System.out.println(campo11.toString());
	
		
	}
	
	@Test
	void objetivo() {
		Campo campo11 = new Campo (1,1);
		campo11.isAberto();
		campo11.minar();
		campo11.isMarcado();
		assertFalse(campo11.objetivoAlcancado());
	}
	@Test
	void Reiniciar() {
		Campo campo11 = new Campo (1,1);
		campo11.reiniciar();
		
	}
}





