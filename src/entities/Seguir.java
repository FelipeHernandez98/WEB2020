package entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Seguir implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id_cliente;
	private int id_tienda;
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_tienda() {
		return id_tienda;
	}
	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
