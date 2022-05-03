package oo.composicao.Desafio;

public class ClienteTest {
public static void main(String[] args) {



Compra Compra1 = new Compra ();
Compra1.adicionarItem("Caneta",10 , 2);
Compra1.adicionarItem("Lapis", 10, 2);

Compra Compra2 = new Compra ();
Compra2.adicionarItem("Impressora", 20, 1);
Compra2.adicionarItem("Camisa", 20, 1);

Cliente cliente = new Cliente ("Yurg Eduardo Patussi");

cliente.compras.add(Compra1);
cliente.compras.add(Compra2);

System.out.println(cliente.obterValorTotal());



}
}
