package Classe;

public class Usuario {

	String Nome;
	String Email;
	

public boolean equals(Object objeto) {
	Usuario outro = (Usuario) objeto;
	
	boolean igualNome = outro.Nome.equals(this.Nome);
	boolean igualEmail = outro.Email.equals(this.Email);
	
	return igualNome && igualEmail;
}
}
