package dao;

import java.util.List;

import model.Client;
import model.Compte;

public interface IDao {

	List<Client> listeClient();

	void creerClient(Client client);

	Client afficherClient(int id);

	void editerClient(Client client);
	
//	void voirListeCompte(Compte compte);
}
