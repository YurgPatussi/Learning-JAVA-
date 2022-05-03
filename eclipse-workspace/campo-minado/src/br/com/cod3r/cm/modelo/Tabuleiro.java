package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.cod3r.cm.ExplosaoException;

public class Tabuleiro {
private int linhas;
private int colunas;
private int minas;

private final List<Campo> campos = new ArrayList<Campo>();

public Tabuleiro(int linhas, int colunas, int minas) {
	this.linhas = linhas;
	this.colunas = colunas;
	this.minas = minas;
gerarCampos();
associarVizinhos();
sortearMinas();
}


public void abrir (int linha, int coluna) {
try {
	campos.parallelStream()
	.filter(c->c.getLinha()==linha && c.getColuna() == coluna)
	.findFirst()
	.ifPresent(c->c.abrir());
}
catch(ExplosaoException e) {
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
		campos.add(new Campo (linha,coluna));
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
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("  ");
	for (int C = 0; C < colunas; C++) {
		sb.append(" ");
		sb.append(C);
		sb.append(" ");
	}
	sb.append("\n");
	int i=0;
	
	for (int linha = 0; linha < linhas; linha++) {
		sb.append(linha);
		sb.append(" ");
		
		for(int coluna = 0; coluna < colunas; coluna++) {
		sb.append(" ");
		sb.append(campos.get(i));
		sb.append(" ");
		i++;
		}
	sb.append("\n");
	}
	
	return sb.toString();
}


}
