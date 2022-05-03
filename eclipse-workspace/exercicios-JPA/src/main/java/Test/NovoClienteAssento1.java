package Test;

import infra.DAO;
import modelo.basico.umpraum.Assento;
import modelo.basico.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		Assento assento = new Assento("67A");
		Cliente cliente = new Cliente ("Mayara", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT().incluir(assento).incluir(cliente).fecharT().fechar();
		
		
		
		
		
		
		
	}
	
}
