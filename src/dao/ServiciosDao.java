package dao;

import java.util.List;

import javax.persistence.EntityManager;



import util.JPAUtil;

public class ServiciosDao {
EntityManager em = null;
	
	public ServiciosDao() {
		this.em = JPAUtil.getEntityManagerFactory().createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<ServiciosDao> listar (){
		return (List<ServiciosDao>) em.createQuery("select s from Servicio s").getResultList();
	}
}
