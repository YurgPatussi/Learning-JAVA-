package teste.umpramuitos;

import infra.DAO;
import umpramuitos.ItemPedido;
import umpramuitos.Pedido;

public class ObterPedido {
public static void main(String[] args) {
	DAO<Pedido> dao = new DAO<> (Pedido.class);
	
	Pedido pedido = dao.obterPorID(1L);
	
	for (ItemPedido item: pedido.getItens()) {
		System.out.println(item.getQuantidade());
	}
	dao.fechar();
}
}
