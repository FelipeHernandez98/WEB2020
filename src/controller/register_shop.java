package controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Tienda;
import util.JPAUtil;

/**
 * Servlet implementation class tipo_registro
 */
@WebServlet("/register_shop")
public class register_shop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register_shop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("register_shop.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String lema = request.getParameter("lema");
		String descripcion = request.getParameter("descripcion");
		String email = request.getParameter("email");
		String clave = request.getParameter("clave");
		String propietario = request.getParameter("propietario");
		String facebook = request.getParameter("facebook");
		String web = request.getParameter("web");
		String imagen = request.getParameter("imagen");
		
		
		Tienda objTienda = new Tienda();
		objTienda.setClave(clave);
		objTienda.setNombre(nombre);
		objTienda.setEmail(email);
		objTienda.setDescripcion(descripcion);
		objTienda.setFacebook(facebook);
		objTienda.setWeb(web);
		objTienda.setLema(lema);
		objTienda.setImagen(imagen);
		objTienda.setPropietario(propietario);
		
		System.out.print(objTienda.getNombre());
		
		EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
		entity.getTransaction().begin();
		entity.persist(objTienda);
		entity.getTransaction().commit();
		System.out.println("Tienda registrada.."+objTienda.toString());
		request.getRequestDispatcher("select_registro.jsp").forward(request, response);
	}

}
