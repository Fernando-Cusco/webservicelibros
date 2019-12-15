package apirest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import modelo.Usuario;


@Path("/usuario")
public class ServiceLogin {
	
	
	@POST
	@Path("/validar")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Usuario validarUsuario(Usuario usuario) {
		usuario.setEsvalido(false);
		if(usuario.getUsuario().equals("admin") && usuario.getPassword().equals("admin" )) {
			usuario.setEsvalido(true);
		}
		return usuario;
	}
	
}

