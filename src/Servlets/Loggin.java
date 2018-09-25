package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Business.Entities.Usuario;
import Business.Logic.UsuarioLogic;

/**
 * Servlet implementation class Loggin
 */
public class Loggin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loggin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usu=request.getParameter("txtNombreUsuario");
		String clave=request.getParameter("txtContraseña");
		UsuarioLogic ul=new UsuarioLogic();
		Usuario user=ul.GetOne(usu, clave);
		if(user==null){
			request.getRequestDispatcher("registroUsuario.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("index.jsp").forward(request, response);

		}
	}

}
