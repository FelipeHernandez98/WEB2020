package dao;

import java.util.List;

import javax.persistence.EntityManager;



import util.JPAUtil;

public class TiendaDao {
EntityManager em = null;
	
	public TiendaDao() {
		this.em = JPAUtil.getEntityManagerFactory().createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<TiendaDao> listar (){
		return (List<TiendaDao>) em.createQuery("select t from Tienda t").getResultList();
	}
}
