package service;

import java.util.List;

import model.Client;
import model.Compte;

public interface IServiceClient {

	List<Client> afficherListeClient();

	void afficherClient(int id);

	void creerClient(String nom, String prenom, String adresse, String codePostal, String ville, String telephone,
			String eMail);

	Client voirFicheClient(int id);

	Client editerClient(Client client);
	

}
