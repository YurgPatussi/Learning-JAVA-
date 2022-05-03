package br.com.cod3r.cal.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora () {
		organizarLayout();
		
		
		
		setTitle("Calculadora");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(232, 322);
		setLocationRelativeTo(null);
		
	}
	
	private void organizarLayout() {
	setLayout(new BorderLayout());
	Display display = new Display();
	display.setPreferredSize(new Dimension(233,60));
	Teclado teclado = new Teclado ();
	add(display, BorderLayout.NORTH);
	add(teclado, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		new Calculadora();
		
		
		
	}
	
}
