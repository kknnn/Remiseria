package Business.Entities;

public class Usuario extends Entidad{
	private String nombreUsuario;
	private String contraseña;
	private String direccion;
	private String telefono;
	private String email;
	private String nombre;
	private String apellido;
	private int tipo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public Usuario(int id, String nombreUsuario, String contraseña, String direccion, String telefono, String email, String nombre, String apellido, int tipo){
		super.setId(id);
		this.setNombreUsuario(nombreUsuario);
		this.setContraseña(contraseña);
		this.setDireccion(direccion);
		this.setTelefono(telefono);
		this.setEmail(email);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setTipo(tipo);
	}
	
	public Usuario(){
		
	}
}
