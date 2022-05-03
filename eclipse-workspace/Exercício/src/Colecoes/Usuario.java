package Colecoes;

import java.util.Objects;

public class Usuario {

	String Nome;

	Usuario (String Nome ) {
		this.Nome = Nome;
	}
	
	
	@Override
	public String toString() {
		return "Meu nome é " + this.Nome + "!";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(Nome, other.Nome);
	}
	
}
