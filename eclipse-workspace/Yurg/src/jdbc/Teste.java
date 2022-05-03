package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {
public static void main(String[] args) throws SQLException{
	
		
		
	final String stringConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
	final String usuario = "root";
	final String senha = "yurg4830";
	
	Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);
	System.out.println("Conexão efetuada!!!");
	conexao.close();
}
}
