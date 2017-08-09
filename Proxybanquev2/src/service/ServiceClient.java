package service;

import java.util.List;

import dao.Dao;
import model.Client;
import model.Compte;

/**
 * 
 * @author Van-anh et Sébastien
 *
 *La classe ServiceClient permet de transmettre les données entre la dao et la view concernant les clients
 */
public class ServiceClient implements IServiceClient {

	Dao dao = new Dao();

	/**
	 * La méthode afficherListeClient permet de remonter la liste des clients
	 * récupérer depuis le dao et de la transmettre à l'affichage de la liste
	 * clients
	 */
	@Override
	public List<Client> afficherListeClient() {
		return dao.listeClient();

	}

	/**
	 * La méthode creerClient permet de transmettre les informations saisies dans le
	 * formulaire de création d'un client pour la transmettre à la dao
	 */
	@Override
	public void creerClient(String nom, String prenom, String adresse, String codePostal, String ville,
			String telephone, String eMail) {

		Client client = new Client(nom, prenom, adresse, codePostal, ville, telephone, eMail);
		dao.creerClient(client);
	}

	/**
	 * La méthode afficherClient permet de transmettre les informations d'un client
	 * séléctionné dans la liste clients
	 */
	@Override
	public void afficherClient(int id) {

		dao.afficherClient(id);

	}

	/**
	 * La méthode voirFichelient permet de transmettre les informations d'un client
	 * depuis la dao
	 */
	public Client voirFicheClient(int id) {
		Client cli = dao.afficherClient(id);

		return cli;

	}

	/**
	 * La méthode editerClient permet de transmettre les informations saisies dans
	 * le formulaire d'édition de la fiche client vers la dao
	 */
	@Override
	public Client editerClient(Client client) {
		dao.editerClient(client);

		return client;
	}

}
