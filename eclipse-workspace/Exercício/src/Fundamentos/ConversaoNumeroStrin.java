package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoNumeroStrin 
{
	public static void main(String[] args) 
	
	{
	
	String Num1 = JOptionPane.showInputDialog("Digete o valor 1:");
	String Num2 = JOptionPane.showInputDialog("Digete o valor 2:");
	
	System.out.println(Num1 + Num2);
	
	double d1 = Double.parseDouble(Num1);
	double d2 = Double.parseDouble(Num2);
	
	double soma = d1 + d2;
	System.out.println("Soma dos valores ? " + soma);
	System.out.println("M?dia dos valores ? " + (d1 + d2)/2);
		
	}

}
