package modelo;

import java.util.Date;

public class Usuario {

	private int id;
	private String usuario;
	private String password;
	private int edad;
	private Date fecha;
	private boolean esvalido;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEsvalido() {
		return esvalido;
	}
	public void setEsvalido(boolean esvalido) {
		this.esvalido = esvalido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
