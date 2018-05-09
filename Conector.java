package InsertarDatosMySQL;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Conector {
	
	private PreparedStatement paraInsertar;
	private Statement stmnt;
	private Connection conexion;

	public void Insertar(Personas p) throws SQLException, ClassNotFoundException {
		
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "");
		stmnt = (Statement) conexion.createStatement();
		
		paraInsertar = (PreparedStatement) conexion.prepareStatement("INSERT INTO PERSONAS (Nombre, Apellidos, Telefono)"+ " values(?,?,?)");
		paraInsertar.setString(1, p.getNombre());
		paraInsertar.setString(2, p.getApellidos());
		paraInsertar.setString(3, p.getTelefono());
		
		paraInsertar.executeUpdate();
	}catch (ClassNotFoundException cn) {
		cn.printStackTrace();
	}
	
}

}
