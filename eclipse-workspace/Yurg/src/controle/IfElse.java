package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) 
	{
		String valor = JOptionPane.showInputDialog("Informe um n�mero: ");
		int num01 = Integer.parseInt(valor);
		
		double num02 = num01 % 2;
		
		if (num02 == 0)
			System.out.println("N�mero � par!");
		else 
			System.out.println("N�mero � �mpar!");
	}
}
