package fr.epsi.network.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDao {
	
	public void connection (){
		
		Connection con = null;
		ResultSet resultat = null;
		Statement statement = null;
		
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost:9003", "sa", "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement = con.createStatement();
			resultat = statement.executeQuery("SELECT * FROM USERS");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(resultat.next()){
				System.out.println(resultat.getString(1)) ;
				System.out.println(resultat.getString(2)) ;
				System.out.println(resultat.getString(3)) ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main (String [] args){
		new ConnectionDao().connection();
	}
}
