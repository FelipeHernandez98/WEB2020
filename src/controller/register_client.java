package controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Cliente;
import util.JPAUtil;

/**
 * Servlet implementation class register_alumn
 */
@WebServlet("/register_client")
public class register_client extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register_client() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("register_client.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String clave = request.getParameter("clave");
		
		Cliente objCliente = new Cliente();
		objCliente.setClave(clave);
		objCliente.setNombre(nombre);
		objCliente.setEmail(email);
		
		EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
		entity.getTransaction().begin();
		entity.persist(objCliente);
		entity.getTransaction().commit();
		System.out.println("Cliente registrado.."+objCliente.toString());
		request.getRequestDispatcher("select_registro.jsp").forward(request, response);
		
		
		
	}

}
