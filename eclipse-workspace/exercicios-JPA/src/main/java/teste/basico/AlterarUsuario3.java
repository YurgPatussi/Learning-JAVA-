package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
	EntityManager em = emf.createEntityManager();

	em.getTransaction().begin();
	Usuario usuario = em.find(Usuario.class, 2L);
	// Para não sicronizar automaticamente => Tirar do estado gerenciado
	em.detach(usuario);
	usuario.setNome("Patussi => Mayara");
	usuario.setEmail("BBBBr.@aaa.com");
	em.merge(usuario);
	em.getTransaction().commit();
	
	
	
	
	emf.close();
	em.close();
}
}
