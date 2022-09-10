package aplicacao;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.sql.Connection; 
import java.sql.ResultSet; 
import java.sql.Statement; 

public class principal {

	public static void main(String[] args) {
		Connection conecta = null; 

		try { 

		conecta = DriverManager.getConnection("jdbc:mysql://localhost/otimiza_condominio?" +"user=root&password=060989"); 

		System.out.println("Conexão realizada com sucesso."); 
		
		} catch (SQLException ex) { 

		    

		    System.out.println("SQLException: " + ex.getMessage()); 

		    System.out.println("SQLState: " + ex.getSQLState()); 

		    System.out.println("VendorError: " + ex.getErrorCode()); 

		} 

	}

}
