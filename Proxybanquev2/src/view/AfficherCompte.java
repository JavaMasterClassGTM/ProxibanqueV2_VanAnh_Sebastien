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
 *La classe ServletAfficherCompte permet d'afficher les comptes du client sélectionné
 */
@WebServlet("/AfficherCompte")
public class AfficherCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AfficherCompte() {
        super();
        
    }

	/**
	 * La méthode doGet permet d'afficher la liste des comptes d'un client
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 int id = Integer.parseInt(request.getParameter("id"));
			
		
			ServiceCompte service = new ServiceCompte();
			
			
			Compte compte =	service.voirListeCompte(id);
			HttpSession session = request.getSession();
			session.setAttribute("compte", compte);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/FicheClient.jsp");
			dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
