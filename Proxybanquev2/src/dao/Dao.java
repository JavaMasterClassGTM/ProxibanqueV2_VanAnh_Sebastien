package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Client;
import model.Compte;
import service.ServiceClient;
import util.Bdd;

/**
 * 
 * @author Van-anh et Sébastien
 *
 *         Le Dao fait le lien entre l'application et la base de données
 */
public class Dao implements IDao {
	/**
	 * La méthode listeClient permet d'afficher la liste des clients
	 */
	@Override
	public List<Client> listeClient() {

		List<Client> listeClient = new ArrayList<>();

		Connection cnx = Bdd.seConnecter();

		Statement stmt;
		try {
			stmt = cnx.createStatement();

			String sql = "Select Id,Nom, Prenom from client";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Client list = new Client();

				list.setId(rs.getInt("id"));
				list.setNom(rs.getString("nom"));
				list.setPrenom(rs.getString("prenom"));
				listeClient.add(list);
			}
		} catch (SQLException ex) {

			Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
		}
		Bdd.seDeconnecter(cnx);

		return listeClient;
	}

	/**
	 * La méthode creerClient permet de créer un nouveau client dans la base de
	 * données en cliquand sur "Ajout client"
	 */
	@Override
	public void creerClient(Client client) {
		Connection cnx = Bdd.seConnecter();

		try {
			System.out.println(client);

			Statement stat = cnx.createStatement();

			String i = "insert into client(Nom, Prenom, Adresse, CodePostal, Ville, Telephone, Email) " + "values ('"
					+ client.getNom() + "', '" + client.getPrenom() + "', '" + client.getAdresse() + "', '"
					+ client.getCodePostal() + "', '" + client.getVille() + "', '" + client.getTelephone() + "', '"
					+ client.geteMail() + "')";

			stat.executeUpdate(i);

		} catch (SQLException ex) {
			Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);

		}

		Bdd.seDeconnecter(cnx);

	}

	/**
	 * La m&thode afficherClient permet d'afficher le client en cliquand sur "Editer
	 * client"
	 */
	@Override
	public Client afficherClient(int id) {

		Connection cnx = Bdd.seConnecter();
		Client client = null;

		try {

			String i = "select * from client where Id=?";
			PreparedStatement pstmt = cnx.prepareStatement(i);

			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int I = rs.getInt("id");
				String nom = rs.getString("Nom");
				String prenom = rs.getString("Prenom");
				String adresse = rs.getString("Adresse");
				String codePostal = rs.getString("CodePostal");
				String ville = rs.getString("Ville");
				String telephone = rs.getString("Telephone");
				String eMail = rs.getString("Email");

				client = new Client(nom, prenom, adresse, codePostal, ville, telephone, eMail);

			}

		} catch (SQLException ex) {
			Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);

		}

		Bdd.seDeconnecter(cnx);
		return client;

	}

	/**
	 * La méthode editerClient permet d'éditer les informations d'un client dans la
	 * base de données
	 */
	@Override
	public void editerClient(Client client) {

		Connection cnx = Bdd.seConnecter();

		try {
			System.out.println("client");
			System.out.println(client.getId());
			String i = "update Client set Adresse = ?, CodePostal = ?, Ville = ?, Telephone = ?, Email = ? where Id = ?";

			PreparedStatement pstmt = cnx.prepareStatement(i);

			pstmt.setString(1, client.getAdresse());
			pstmt.setString(2, client.getCodePostal());
			pstmt.setString(3, client.getVille());
			pstmt.setString(4, client.getTelephone());
			pstmt.setString(5, client.geteMail());
			pstmt.setInt(6, client.getId());

			pstmt.executeUpdate();

		} catch (SQLException ex) {
			Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);

		}

		Bdd.seDeconnecter(cnx);
	}
	}

	/**
	 * La méthode voirListeCompte permet de voir les comptes d'un client en cliquant
	 * sur "voir comptes"
	 */
//	@Override
//	public Compte voirListeCompte(Compte compte) {
//		// TODO Auto-generated method stubConnection cnx = Bdd.seConnecter();
//		Connection cnx = Bdd.seConnecter();
//		
//
//		try {
//
//			String i = "select * from compte courant join client using Id where Id=?";
//			PreparedStatement pstmt = cnx.prepareStatement(i);
//
//			pstmt.setInt(1, id);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				int I = rs.getInt("id");
//				double solde = rs.getDouble("Solde");
//				int numerocompte = rs.getInt("NumeroCompte");
//				String date = rs.getString("DateOuverture");
//
//				
//
//			}
//
//		} catch (SQLException ex) {
//			Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
//
//		}
//
//		Bdd.seDeconnecter(cnx);
//		return compte;
//
//	}
//
//}
