package Data.Database;

import java.sql.SQLException;

import Business.Entities.Usuario;

public class UsuarioData extends Conector{
	
	public boolean UsuarioExiste(String nombreUsuario){
		boolean existe=false;
		try {
			super.abrirConexion();
			pstmt=conn.prepareStatement("select * from usuarios where nombreUsuario=?");
			pstmt.setString(1, nombreUsuario);
			rs=pstmt.executeQuery();
			if(rs.next()){
				existe=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			super.cerrarConexion();
		}
		return existe;
	}
	
	public void AgregarUsuario(Usuario u){
		try {
			super.abrirConexion();
			pstmt=conn.prepareStatement("insert into usuarios (contraseña, nombre, apellido, direccion, telefono, email, tipo, nombreUsuario) values (?,?,?,?,?,?,?,?)");
			pstmt.setString(1, u.getContraseña());
			pstmt.setString(2, u.getNombre());
			pstmt.setString(3, u.getApellido());
			pstmt.setString(4, u.getDireccion());
			pstmt.setString(5, u.getTelefono());
			pstmt.setString(6, u.getEmail());
			pstmt.setInt(7, u.getTipo());
			pstmt.setString(8, u.getNombreUsuario());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			super.cerrarConexion();
		}
	}
	
	public Usuario GetOne(String usuario, String contraseña){
		Usuario user=null;
		try {
			super.abrirConexion();
			pstmt=conn.prepareStatement("select * from usuarios where (nombreUsuario=? and clave=?)");
			pstmt.setString(1, usuario);
			pstmt.setString(2, contraseña);
			rs=pstmt.executeQuery();
			if(rs.next()){
				user=new Usuario(rs.getInt("idUsuario"), rs.getString("nombreUsuario"), rs.getString("contraseña"), rs.getString("direccion"), rs.getString("telefono"), rs.getString("email"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("tipo"));		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			super.cerrarConexion();
		}
		return user;
	}

}
