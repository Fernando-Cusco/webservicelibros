package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.UsuarioDao;
import modelo.Usuario;

@Stateless
public class UsuarioOn {
	
	@Inject
	private UsuarioDao ud;
	public void crearUsuario(Usuario usuario) {
		ud.crearUsuario(usuario);
	}
}
