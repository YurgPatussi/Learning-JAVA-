package Test;

import infra.DAO;
import modelo.basico.umpraum.Assento;
import modelo.basico.umpraum.Cliente;

public class NovoClienteAssento2 {
public static void main(String[] args) {
	
	Assento assento = new Assento ("D4");
	Cliente cliente = new Cliente ("Rodrigo", assento);
	
	DAO<Cliente>dao = new DAO<>();
	
	dao.incluirAtomico(cliente);
	
	
	
	
}
}
