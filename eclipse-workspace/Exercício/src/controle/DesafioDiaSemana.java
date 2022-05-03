package controle;


import javax.swing.JOptionPane;



public class DesafioDiaSemana
{
	public static void main(String[] args)
	{
		

		
		String dia = JOptionPane.showInputDialog("INFORME O DIA DA SEMANA:");
	    String day = dia.toUpperCase();
	
			
		if (day.equals("DOMINGO"))
			System.out.println("Dia número 1");
		else if(day.equals("SEGUNDA"))
			System.out.println("Dia número 2");
		else if(day.equals("TERÇA"))
			System.out.println("Dia número 3");
		else if(day.equals("QUARTA"))
			System.out.println("Dia número 4");
		else if(day.equals("QUINTA"))
			System.out.println("Dia número 5");
		else if(day.equals("SEXTA"))
			System.out.println("Dia número 6");
		else if(day.equals("SÁBADO"))
			System.out.println("Dia número 7");
		
		System.out.println("End program.");
		
	}
}
