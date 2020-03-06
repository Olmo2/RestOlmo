package com.olmo.restOlmo.usuarios;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Usuario   {

	


	@Id
	private String usuario;
	
	@Column
	private String password;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String email;
	
	@Column
	private int edad;


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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", edad=" + edad + "]";
	}
}
