package InsertarDatosMySQL;

public class Personas {
	
	private String Nombre;
	private String Apellidos;
	private String Telefono;

	
	public Personas() {}
	
	public Personas (String Nombre, String Apellidos, String Telefono) {
		
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Telefono = Telefono;
	
	}

	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setDireccion(String Apellidos) {
		Apellidos = Apellidos;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

}
