package controle;

public class DesafioFor 
{
	public static void main(String[] args) 
	{
		
		
		String Final = "########################";
	

		for ( String Valor = "#"; !Valor.equalsIgnoreCase(Final); Valor += "#")
		{
			System.out.println(Valor);
		}
	}
}
