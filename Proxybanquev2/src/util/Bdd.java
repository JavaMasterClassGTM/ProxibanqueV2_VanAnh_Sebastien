package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * 
 * @author Van-anh et Sébastien
 *
 *La classe Bdd permet de se connecter et se déconnecter de la base de données
 */
public class Bdd {
	static String url = "jdbc:mysql://localhost/proxibanque";
	static String login = "root";
	static String password = "";

	/**
	 * La méthode seConnecter permet la connexion à la base de données
	 * 
	 */
	public static Connection seConnecter() {
		Connection cnx = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			cnx = DriverManager.getConnection(url, login, password);
			
		} catch (ClassNotFoundException | SQLException ex) {

			Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return cnx;
	}

	/**
	 * La méthode seDeconnecter permet la déconnexion à la base de données
	 * 
	 */
	public static void seDeconnecter(Connection cnx) {
		try {
			cnx.close();
		} catch (SQLException ex) {
			Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

