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
	
	// Configurar Layout para n�o haver espa�o
	c.weightx =1;
	c.weighty =1;
	//Juntar td.
	c.fill= GridBagConstraints.BOTH;
	//Linha 1
	c.gridwidth =2;
	adcionarBot�o("AC", COR_CINZA_ESCUTO,c,0,0);
	c.gridwidth =1;
	adcionarBot�o("�", COR_CINZA_ESCUTO,c,2,0);
	adcionarBot�o("/", COR_LARANJA,c,3,0);

	//Linha 2
	adcionarBot�o("7", COR_CINZA_CLARO,c,0,1);
	adcionarBot�o("8", COR_CINZA_CLARO,c,1,1);
	adcionarBot�o("9", COR_CINZA_CLARO,c,2,1);
	adcionarBot�o("X", COR_LARANJA,c,3,1);
	
	//Linha 3
	adcionarBot�o("4", COR_CINZA_CLARO,c,0,2);
	adcionarBot�o("5", COR_CINZA_CLARO,c,1,2);
	adcionarBot�o("6", COR_CINZA_CLARO,c,2,2);
	adcionarBot�o("-", COR_LARANJA,c,3,2);
	
	//Linha 4
	adcionarBot�o("1", COR_CINZA_CLARO,c,0,3);
	adcionarBot�o("2", COR_CINZA_CLARO,c,1,3);
	adcionarBot�o("3", COR_CINZA_CLARO,c,2,3);
	adcionarBot�o("+", COR_LARANJA,c,3,3);
	
	//Linha 5
	c.gridwidth =2;
	adcionarBot�o("0", COR_CINZA_CLARO,c,0,4);
	c.gridwidth =1;
	adcionarBot�o(",", COR_CINZA_CLARO,c,2,4);
	adcionarBot�o("=", COR_LARANJA,c,3,4);
	
	
}

private void adcionarBot�o(String text, Color cor, GridBagConstraints c, int x, int y) {
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

