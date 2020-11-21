package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="email")
	private String email;
	@Column(name="clave")
	private String clave;
	
	public Cliente(){}
	public Cliente(int id, String nombre, String email, String clave) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.clave = clave;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", email=" + email + ", clave=" + clave + "]";
	}
	

}
