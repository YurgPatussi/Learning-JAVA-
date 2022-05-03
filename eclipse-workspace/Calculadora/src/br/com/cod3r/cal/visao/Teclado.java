package br.com.cod3r.cal.visao;


import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.cod3r.cal.visao.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener{
private final Color COR_CINZA_ESCUTO = new Color(68,68,68);
private final Color COR_CINZA_CLARO = new Color(99,99,99);
private final Color COR_LARANJA = new Color(242,163,60);

public Teclado() {
	
	GridBagLayout layout = new GridBagLayout();
	GridBagConstraints c = new GridBagConstraints();
	setLayout(layout);
	
	// Configurar Layout para não haver espaço
	c.weightx =1;
	c.weighty =1;
	//Juntar td.
	c.fill= GridBagConstraints.BOTH;
	//Linha 1
	c.gridwidth =2;
	adcionarBotão("AC", COR_CINZA_ESCUTO,c,0,0);
	c.gridwidth =1;
	adcionarBotão("±", COR_CINZA_ESCUTO,c,2,0);
	adcionarBotão("/", COR_LARANJA,c,3,0);

	//Linha 2
	adcionarBotão("7", COR_CINZA_CLARO,c,0,1);
	adcionarBotão("8", COR_CINZA_CLARO,c,1,1);
	adcionarBotão("9", COR_CINZA_CLARO,c,2,1);
	adcionarBotão("X", COR_LARANJA,c,3,1);
	
	//Linha 3
	adcionarBotão("4", COR_CINZA_CLARO,c,0,2);
	adcionarBotão("5", COR_CINZA_CLARO,c,1,2);
	adcionarBotão("6", COR_CINZA_CLARO,c,2,2);
	adcionarBotão("-", COR_LARANJA,c,3,2);
	
	//Linha 4
	adcionarBotão("1", COR_CINZA_CLARO,c,0,3);
	adcionarBotão("2", COR_CINZA_CLARO,c,1,3);
	adcionarBotão("3", COR_CINZA_CLARO,c,2,3);
	adcionarBotão("+", COR_LARANJA,c,3,3);
	
	//Linha 5
	c.gridwidth =2;
	adcionarBotão("0", COR_CINZA_CLARO,c,0,4);
	c.gridwidth =1;
	adcionarBotão(",", COR_CINZA_CLARO,c,2,4);
	adcionarBotão("=", COR_LARANJA,c,3,4);
	
	
}

private void adcionarBotão(String text, Color cor, GridBagConstraints c, int x, int y) {
	c.gridy = y;
	c.gridx = x;
	Botao botao = new Botao (text,cor);
	botao.addActionListener(this);
	add(botao, c);
	
}


//Etapa que parei
@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() instanceof JButton) {
	JButton botao = (JButton) e.getSource();
	Memoria.getInstancia().processarComando(botao.getText());;
}
}

}

