package jdbc;

public class DAOTeste {
public static void main(String[] args) {
	
	DAO dao = new DAO ();
	
	String sql = "INSERT INTO pessoas (nome) VALUE (?)";
	System.out.println(dao.incluir(sql, "Yurg Eduardo Patussi"));
	System.out.println(dao.incluir(sql, "Mayara de Fatima Frazao Patussi"));
	System.out.println(dao.incluir(sql, "Maria Aparecida de Oliveira Patussi"));
	System.out.println(dao.incluir(sql, "Roberto Patussi"));
	
}
}
