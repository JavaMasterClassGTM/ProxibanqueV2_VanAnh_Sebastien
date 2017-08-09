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
 *         La classe ServletEditerClient permet de modifier les données du
 *         client à partir des nouvelles données saisies dans le formulaire
 */
@WebServlet("/ServletEditerClient")
public class ServletEditerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletEditerClient() {
		super();

	}

	/**
	 * La méthode doGet récupère les nouvelles données clients et les transmets au
	 * service, elle renvoie ensuite sur la liste clients
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		System.out.println("id" + id);
		String adresse = request.getParameter("adresse");
		String codePostal = request.getParameter("codePostal");
		String ville = request.getParameter("client");
		String telephone = request.getParameter("telephone");
		String eMail = request.getParameter("eMail");

		ServiceClient service = new ServiceClient();

		HttpSession session = request.getSession();

		Client client = new Client(id, adresse, codePostal, ville, telephone, eMail);

		service.editerClient(client);
		session.setAttribute("client", client);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ListeClients.jsp");
		dispatcher.forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
