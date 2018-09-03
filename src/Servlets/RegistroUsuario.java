package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Business.Entities.Usuario;
import Business.Logic.UsuarioLogic;

/**
 * Servlet implementation class RegistroUsuario
 */
public class RegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuario() {
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
		String nombre=request.getParameter("txtNombre");
		String apellido=request.getParameter("txtApellido");
		String usuario=request.getParameter("txtUsuario");
		String contraseña=request.getParameter("txtContrase�a");
		String contraseña2=request.getParameter("txtContrase�a2");
		String direccion=request.getParameter("txtDireccion");
		String telefono=request.getParameter("txtTelefono");
		String email=request.getParameter("txtEmail");
		UsuarioLogic ul=new UsuarioLogic();
		if(contraseña.equals(contraseña2)){
			if(!(ul.UsuarioExiste(usuario))){
				Usuario u=new Usuario(0,usuario,contraseña,direccion,telefono,email,nombre,apellido,1);
				ul.AgregarUsuario(u);
				//request.getSession().setAttribute("servletMsg", u.getNombre());
				//response.sendRedirect("pruebabase.jsp");
				request.getRequestDispatcher("confirmaRegistro.jsp").forward(request, response);
			}
			else{
				request.getRequestDispatcher("registroUsuario.jsp?mensaje=Usuario ya existe").forward(request, response);
			}
		}
		else{
			request.getRequestDispatcher("registroUsuario.jsp?mensaje=Contrase�as no coiinciden").forward(request, response);
		}
		
	}

}
