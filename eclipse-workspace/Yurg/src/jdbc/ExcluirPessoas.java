package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoas {

	public static void main(String[] args) throws SQLException {
		
	Scanner entrada = new Scanner (System.in);
	System.out.println("INFORME O CODIGO: ");
	int codigo = entrada.nextInt();
	
	Connection conexao = FabricaDeConexao.getConexao();
	
	String sql = "DELETE FROM pessoas WHERE codigo = ?";
	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setInt(1, codigo);
	
	
	if(stmt.executeUpdate()>0) {
		System.out.println("PESSOA EXCLUIDA!!!");
		
	}else {
		System.out.println("Pessoa não encontrada!!!");
	}
	
	conexao.close();
	entrada.close();	
	}
	
}
