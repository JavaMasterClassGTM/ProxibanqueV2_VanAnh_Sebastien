package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * 
 * @author Van-anh et S�bastien
 *
 *La classe Bdd permet de se connecter et se d�connecter de la base de donn�es
 */
public class Bdd {
	static String url = "jdbc:mysql://localhost/proxibanque";
	static String login = "root";
	static String password = "";

	/**
	 * La m�thode seConnecter permet la connexion � la base de donn�es
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
	 * La m�thode seDeconnecter permet la d�connexion � la base de donn�es
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

