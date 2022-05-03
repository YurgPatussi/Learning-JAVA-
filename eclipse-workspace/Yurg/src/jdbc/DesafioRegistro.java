package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioRegistro {
public static void main(String[] args) throws SQLException {
	String Select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
	String Update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("INFORME UM CHAVE DE ACESSO: ");
	int valor = entrada.nextInt();

	
	Connection conexao = FabricaDeConexao.getConexao();

	
	PreparedStatement stmt = conexao.prepareStatement(Select);
	stmt.setInt(1, valor);
	ResultSet r = stmt.executeQuery();
	if (r.next()) {
		Pessoa p = new Pessoa (r.getInt(1),r.getString(2));
		System.out.println("O nome da pessoa é "+p.getNome());
		entrada.nextLine();
		System.out.println("INFORME UM NOVO NOME: ");
		String NewName = entrada.nextLine();

		stmt.close();
		stmt = conexao.prepareStatement(Update);
		stmt.setString(1, NewName);
		stmt.setInt(2, valor);
		stmt.execute();
		System.out.println("Pessoa adicionada com sucesso!!!");
	} else {
		System.out.println("Pessoa não encontrada!!!");
	}


entrada.close();
}
	
}

