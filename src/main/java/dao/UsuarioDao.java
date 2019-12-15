package dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Usuario;

public class UsuarioDao {

	@Inject
	private EntityManager em;
	
	public void crearUsuario(Usuario usuario) {
		em.persist(usuario);
	}
}
