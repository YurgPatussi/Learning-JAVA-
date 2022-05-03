package Padroes.observe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	
	private List<ObservadorChegadaAniversariante> observadores 
	= new ArrayList<ObservadorChegadaAniversariante>();
	
	public void resgitrarObservador (ObservadorChegadaAniversariante O) {
		observadores.add(O);
	}
	
public void monitorar()
{
	Scanner entrada = new Scanner (System.in);
	String valor="";
	
	while (!"sair".equalsIgnoreCase(valor)) 
	{
	System.out.println("Aniversáriante chegou?");
	valor = entrada.nextLine();
	
	if ("sim".equalsIgnoreCase(valor)) 
	{
		//criar evento
		EventoChegadaAniversariante evento 
		= new EventoChegadaAniversariante(new Date());
		observadores.stream().forEach(o->o.chegou(evento));
		valor = "sair";
	} else {
		System.out.println("Alarme falso.");}
	}
	entrada.close();

}


}


