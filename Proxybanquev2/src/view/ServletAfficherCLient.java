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
import model.Compte;
import service.ServiceClient;
import service.ServiceCompte;

/**
 * 
 * @author Van-anh et Sébastien
 *
 *         La classe ServletAfficherClient permet l'affichage des informations
 *         d'un client en cliquant sur "Editer client"
 */
@WebServlet("/ServletAfficherCLient")
public class ServletAfficherCLient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletAfficherCLient() {
		super();

	}

	/**
	 * La méthode doGet permet d'afficher la fiche du client sélectionné
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		ServiceClient service = new ServiceClient();
		ServiceCompte serviceCompte = new ServiceCompte();

		Compte compte = serviceCompte.voirListeCompte(id);

		HttpSession session = request.getSession();
		session.setAttribute("compte", compte);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ListeCompte.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/FicheClient.jsp");
		dispatcher.forward(request, response);
		;
	}

}
