package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Business.Entities.Usuario;
import Business.Logic.UsuarioLogic;

/**
 * Servlet implementation class IngresoUsuario
 */
public class IngresoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresoUsuario() {
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
		/*String usuario=request.getParameter("txtUsuario");
		String clave=request.getParameter("txtClave");
		UsuarioLogic ul=new UsuarioLogic();
		//Usuario user=ul.GetOne(usuario, contrase�a);
		if(ul.UsuarioExiste(usuario)){
			request.getRequestDispatcher("registro.jsp").forward(request, response);
			//request.getRequestDispatcher("ingreso.jsp?mensaje=Usuario no existe").forward(request, response);
		}else{
			//HttpSession usuarioLogueado=request.getSession();
			//usuarioLogueado.setAttribute("usuario", user);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}*/
		String usuario=request.getParameter("txtUsuario");
		String contraseña=request.getParameter("txtClave");
		UsuarioLogic ul=new UsuarioLogic();
		
			if(!(ul.UsuarioExiste(usuario))){
				//request.getSession().setAttribute("servletMsg", u.getNombre());
				//response.sendRedirect("pruebabase.jsp");
				request.getRequestDispatcher("confirmaRegistro.jsp").forward(request, response);
			}
			else{
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			}

	}

}
