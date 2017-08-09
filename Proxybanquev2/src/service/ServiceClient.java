package service;

import java.util.List;

import dao.Dao;
import model.Client;
import model.Compte;

/**
 * 
 * @author Van-anh et S�bastien
 *
 *La classe ServiceClient permet de transmettre les donn�es entre la dao et la view concernant les clients
 */
public class ServiceClient implements IServiceClient {

	Dao dao = new Dao();

	/**
	 * La m�thode afficherListeClient permet de remonter la liste des clients
	 * r�cup�rer depuis le dao et de la transmettre � l'affichage de la liste
	 * clients
	 */
	@Override
	public List<Client> afficherListeClient() {
		return dao.listeClient();

	}

	/**
	 * La m�thode creerClient permet de transmettre les informations saisies dans le
	 * formulaire de cr�ation d'un client pour la transmettre � la dao
	 */
	@Override
	public void creerClient(String nom, String prenom, String adresse, String codePostal, String ville,
			String telephone, String eMail) {

		Client client = new Client(nom, prenom, adresse, codePostal, ville, telephone, eMail);
		dao.creerClient(client);
	}

	/**
	 * La m�thode afficherClient permet de transmettre les informations d'un client
	 * s�l�ctionn� dans la liste clients
	 */
	@Override
	public void afficherClient(int id) {

		dao.afficherClient(id);

	}

	/**
	 * La m�thode voirFichelient permet de transmettre les informations d'un client
	 * depuis la dao
	 */
	public Client voirFicheClient(int id) {
		Client cli = dao.afficherClient(id);

		return cli;

	}

	/**
	 * La m�thode editerClient permet de transmettre les informations saisies dans
	 * le formulaire d'�dition de la fiche client vers la dao
	 */
	@Override
	public Client editerClient(Client client) {
		dao.editerClient(client);

		return client;
	}

}
