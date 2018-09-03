<%@page import="Business.Entities.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>Inicio</title>
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  <body>
    <div align="right">
    	<a href="ingreso.jsp">Iniciar Sesion</a>&nbsp&nbsp&nbsp
    	<a href="registroUsuario.jsp">Registro</a>
    	
    	<%	/*HttpSession usuarioLogueado=request.getSession(); 
    	
    		if(usuarioLogueado.getAttribute("usuario")!=null){
	    		Usuario user=new Usuario();
	    		user=(Usuario)usuarioLogueado.getAttribute("usuario");
	    		String apellido=user.getApellido();
	    		if(apellido==null){
	    			out.println("No hay");
	    		}
    		}else{
    			out.println("NADAAA");
    		}*/
    		%>
    </div>
     
  </body>
</html>

 
