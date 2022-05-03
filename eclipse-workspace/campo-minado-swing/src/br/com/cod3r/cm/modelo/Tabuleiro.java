package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;



public class Tabuleiro implements CampoObservador{
final private int linhas;
final private int colunas;
private int minas;
private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();
private final List<Campo> campos = new ArrayList<Campo>();

public Tabuleiro(int linhas, int colunas, int minas) {
	this.linhas = linhas;
	this.colunas = colunas;
	this.minas = minas;
gerarCampos();
associarVizinhos();
sortearMinas();
}

public void registrarObservador (Consumer<ResultadoEvento> observador) {
	observadores.add(observador);
}

public void notificarObservador (boolean resultado) {
	observadores.stream()
	.forEach(o-> o.accept(new ResultadoEvento (resultado)));
}
public void abrir (int linha, int coluna) {
try {
	campos.parallelStream()
	.filter(c->c.getLinha()==linha && c.getColuna() == coluna)
	.findFirst()
	.ifPresent(c->c.abrir());
}
catch(Exception e) {
	//FIXME ajutar a implementação
	campos.forEach(A -> A.setAberto(true));
	throw e;
}
}
public void alterarmarcacao (int linha, int coluna) {
	campos.parallelStream()
	.filter(c->c.getLinha()==linha && c.getColuna() == coluna)
	.findFirst()
	.ifPresent(c->c.alternarMarcacao());
}

private void sortearMinas() {
	long minasArmadas=0;
	
	Predicate<Campo> minado = c-> c.isMinado();
	do {
		minasArmadas = campos.stream().filter(minado).count();
		int aleatorio = (int) (Math.random()*campos.size());
		campos.get(aleatorio).minar();
	   } while (minasArmadas <minas);
}

private void associarVizinhos() {
	for (Campo C1: campos) {
		for (Campo C2: campos) {
			C1.adicionarVizinhos(C2);
		}
	}
}

private void gerarCampos() {
for (int linha = 0; linha < linhas; linha++) {
	for(int coluna = 0; coluna < colunas; coluna++) {
		Campo campo = new Campo (linha,coluna);
		campo.registrarObservadores(this);
		campos.add(campo);
		
	}
}
	
}
public boolean objetivoAlcancado() {
return campos.stream().allMatch(c->c.objetivoAlcancado());
}

public void reiniciar () {
	campos.stream().forEach(c->c.reiniciar());
	sortearMinas();
}
@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		if (evento==CampoEvento.EXPLODIR) {
		System.out.println("Perdeu!");
		mostrarMinas();
		notificarObservador(false);
		}
		else if (objetivoAlcancado()) {
			notificarObservador(true);
		}
		
		
		
	}
public void paraCada(Consumer<Campo> funcao) {
	campos.forEach(funcao);
}
private void mostrarMinas() {
	campos.stream()
	.filter(c->c.isMinado())
	.filter(c->!c.isMarcado())
	.forEach(c->c.setAberto(true));
}

public int getLinhas() {
	return linhas;
}

public int getColunas() {
	return colunas;
}


}
