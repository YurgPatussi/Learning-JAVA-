package Padroes.observe;

public class Namorada implements ObservadorChegadaAniversariante{
	

public void chegou(EventoChegadaAniversariante evento) {
System.out.println("Avisar os convidados!");
System.out.println("Apagar às luzers...");
System.out.println("Esperar um pouco...");
System.out.println("e...surpresa!!!");
}	

}
