<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ingreso</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
  		<h2>Ingreso</h2>
  		<form name="ingreso" class="form-horizontal" action="IngresoUsuario" method="post">
    		<div class="form-group">
      			<label class="control-label col-sm-2">Usuario:</label>
      			<div class="col-sm-10">
        			<input type="text" name="txtUsuario" class="form-control" placeholder="Ingrese Usuario" required>
      			</div>
    		</div>
    		<div class="form-group">
      			<label class="control-label col-sm-2">Contraseña:</label>
      			<div class="col-sm-10">
        			<input type="password" name="txtClave" class="form-control" placeholder="Ingrese Contraseña" required>
      			</div>
    		</div>
    		<div class="form-group">
     			<div class="col-sm-offset-2 col-sm-10">
        		<button type="submit" class="btn btn-primary">Aceptar</button>
      			</div>
      		</div>
  		</form>
  		<h4>
			<%
				if(request.getParameter("mensaje")!=null){
					out.println(request.getParameter("mensaje"));
				}
			%>  		
  		</h4>
	</div>
	

</body>
</html>