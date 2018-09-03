package Business.Logic;

import Business.Entities.Usuario;
import Data.Database.UsuarioData;

public class UsuarioLogic {
	
	public boolean UsuarioExiste(String nombreUsuario){
		if(new UsuarioData().UsuarioExiste(nombreUsuario)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void AgregarUsuario(Usuario u){
		new UsuarioData().AgregarUsuario(u);
	}	
	
	public Usuario GetOne(String usuario, String clave){
		return new UsuarioData().GetOne(usuario, clave);
	}

}
