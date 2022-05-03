package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoasDesafios {
public static void main(String[] args) throws SQLException {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe o valor para pesquisa: ");
	String valor = entrada.nextLine();
	
	Connection conexao = FabricaDeConexao.getConexao();
	String sql = "SELECT * FROM pessoas WHERE nome like ?";
	
	
	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setString(1, "%"+valor +"%");
	
	ResultSet resultado = stmt.executeQuery();
	
	List<Pessoa> pessoas = new ArrayList<>();
	
	while (resultado.next()) {
		int codigo = resultado.getInt("Codigo");
		String nome = resultado.getString("nome");
		pessoas.add(new Pessoa (codigo, nome));
		}
		
		for (Pessoa p: pessoas) {
			System.out.println(p.getCodigo()+  "==>" + p.getNome());
		}

entrada.close();
}
}
