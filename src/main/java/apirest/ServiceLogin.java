package apirest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import modelo.Usuario;
import negocio.UsuarioOn;


@Path("/usuario")
public class ServiceLogin {
	
	private UsuarioOn usr;
	
	@POST
	@Path("/usuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response crearUsuario(Usuario usuario) {
		Response.ResponseBuilder response = null;
		
		try {
			usr.crearUsuario(usuario);
			response = Response.ok("ok");
		} catch (Exception e) {
			Map<String, String> responseObj = new HashMap<>();
	        responseObj.put("error", e.getMessage());
			response = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
		}
		return response.build();
	}
	
}

