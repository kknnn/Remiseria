<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<title>Registro</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
  		<h2>Registro</h2>
  		<form name="registro" class="form-horizontal" action="RegistroUsuario" method="post">
    		<div class="form-group">
      			<label class="control-label col-sm-2">Nombre:</label>
      			<div class="col-sm-10">
        			<input type="text" name="txtNombre" class="form-control" placeholder="Ingrese Nombre" required>
      			</div>
    		</div>
    		<div class="form-group">
      			<label class="control-label col-sm-2">Apellido:</label>
      			<div class="col-sm-10">
        			<input type="text" name="txtApellido" class="form-control" placeholder="Ingrese Apellido" required>
      			</div>
    		</div>
    		<div class="form-group">
      			<label class="control-label col-sm-2">Usuario:</label>
      			<div class="col-sm-10">
        			<input type="text" name="txtUsuario" class="form-control" placeholder="Ingrese Usuario" required>
      			</div>
    		</div>
    		<div class="form-group">
      			<label class="control-label col-sm-2">Contraseña:</label>
      			<div class="col-sm-10">
        			<input type="password" name="txtContraseña" class="form-control" minlength="4" placeholder="Ingrese Contraseña" required>
      			</div>
    		</div>
    		<div class="form-group">
      			<label class="control-label col-sm-2">Repita Contraseña:</label>
      			<div class="col-sm-10">
        			<input type="password" name="txtContraseña2" class="form-control" placeholder="Ingrese Contraseña" required>
      			</div>
    		</div>
    		<div class="form-group">
      			<label class="control-label col-sm-2">Direccion:</label>
      			<div class="col-sm-10">
        			<input type="text" name="txtDireccion" class="form-control" placeholder="Ingrese Direccion" required>
      			</div>
    		</div>
    		<div class="form-group">
      			<label class="control-label col-sm-2">Telefono:</label>
      			<div class="col-sm-10">
        			<input type="text" name="txtTelefono" class="form-control" placeholder="Ingrese Telefono" required>
      			</div>
    		</div>
    		<div class="form-group">
      			<label class="control-label col-sm-2">Email:</label>
      			<div class="col-sm-10">
        			<input type="email" name="txtEmail" class="form-control" placeholder="Ingrese Email" required>
      			</div>
    		</div>
    		<div class="form-group">
     			<div class="col-sm-offset-2 col-sm-10">
        		<button type="submit" class="btn btn-primary">Aceptar</button>
      			</div>
      		</div>
  		</form>
	</div>
	<h4>
			<%
			if(request.getParameter("mensaje") != null){
				out.println(request.getParameter("mensaje"));
				}
			%>			
	</h4>


</body>
</html>