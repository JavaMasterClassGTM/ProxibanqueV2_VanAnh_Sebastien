package view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Client;
import service.ServiceClient;

/**
 * 
 * @author Van-anh et Sébastien
 *
 *         La classe ServletCreationClient permet de générer un nouveau client
 *         en récupérant les informations saisies dans le formulaire de création
 *         client
 */
@WebServlet("/ServletCreationClient")
public class ServletCreationClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public ServletCreationClient() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/CreationClient.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * La méthode doPost crée le client et renvoie sur la liste clients
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String codePostal = request.getParameter("codePostal");
		String ville = request.getParameter("client");
		String telephone = request.getParameter("telephone");
		String eMail = request.getParameter("eMail");

		ServiceClient service = new ServiceClient();
		// HttpSession sessionCreation = request.getSession();

		service.creerClient(nom, prenom, adresse, codePostal, ville, telephone, eMail);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ListeClients.jsp");
		dispatcher.forward(request, response);

	}

}
