package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Client;
import model.Conseiller;
import service.ServiceClient;

/**
 * 
 * @author Van-anh et Sébastien
 *
 *         La classe ServletListeClients permet d'afficher la liste clients une
 *         fois que l'utilisateur s'est connecté
 */
@WebServlet("/ServletListeClients")
public class ServletListeClients extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public ServletListeClients() {
		super();

	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	/**
	 * La méthode doPost permet d'afficher la liste clients
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);

	}

	protected void traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		if ("toto".equalsIgnoreCase(login) && "toto".equalsIgnoreCase(password)) {

			Conseiller conseiller = new Conseiller(login, password);
			ServiceClient s = new ServiceClient();
			List<Client> listeClients = s.afficherListeClient();
			for (Client client : listeClients) {

				System.out.println(client.getId());

			}

			HttpSession session = request.getSession();
			session.setAttribute("utilisateur", conseiller);
			session.setAttribute("liste", listeClients);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ListeClients.jsp");
			dispatcher.forward(request, response);

		}

		else if ("toto".equalsIgnoreCase(login) && !"toto".equalsIgnoreCase(password)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ErreurAuthentification2.jsp");
			dispatcher.forward(request, response);
		}

		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ErreurAuthentification.jsp");
			dispatcher.forward(request, response);
		}
	}

}
