package controle;


import javax.swing.JOptionPane;



public class DesafioDiaSemana
{
	public static void main(String[] args)
	{
		

		
		String dia = JOptionPane.showInputDialog("INFORME O DIA DA SEMANA:");
	    String day = dia.toUpperCase();
	
			
		if (day.equals("DOMINGO"))
			System.out.println("Dia n�mero 1");
		else if(day.equals("SEGUNDA"))
			System.out.println("Dia n�mero 2");
		else if(day.equals("TER�A"))
			System.out.println("Dia n�mero 3");
		else if(day.equals("QUARTA"))
			System.out.println("Dia n�mero 4");
		else if(day.equals("QUINTA"))
			System.out.println("Dia n�mero 5");
		else if(day.equals("SEXTA"))
			System.out.println("Dia n�mero 6");
		else if(day.equals("S�BADO"))
			System.out.println("Dia n�mero 7");
		
		System.out.println("End program.");
		
	}
}
