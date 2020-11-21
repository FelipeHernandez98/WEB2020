package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="Tienda.findAll", query="SELECT t FROM Tienda t")
public class Tienda implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="lema")
	private String lema;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="email")
	private String email;
	@Column(name="clave")
	private String clave;
	@Column(name="propietario")
	private String propietario;
	@Column(name="facebook")
	private String facebook;
	@Column(name="web")
	private String web;
	@Column(name="imagen")
	private String imagen;
	

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
	public String getLema() {
		return lema;
	}
	public void setLema(String lema) {
		this.lema = lema;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Tienda [id=" + id + ", nombre=" + nombre + ", lema=" + lema + ", descripcion=" + descripcion
				+ ", email=" + email + ", clave=" + clave + ", propietario=" + propietario + ", facebook=" + facebook
				+ ", web=" + web + ", imagen=" + imagen + "]";
	}
	
	

}
