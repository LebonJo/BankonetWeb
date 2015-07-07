package com.bankonet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bankonet.model.BankonetException;
import com.bankonet.model.Client;
import com.bankonet.service.BanqueService;
import com.bankonet.service.BanqueServiceManager;

/**
 * Servlet implementation class TraiterLoginServlet
 */
public class TraiterLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiterLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String identifiant = request.getParameter("identifiant");
		String motDePasse = request.getParameter("motDePasse");
		
		BanqueService banqueService = BanqueServiceManager.getBanqueService();

        try {
			Client c = banqueService.findClient(identifiant, motDePasse);
			System.out.println("NOM : " + c.getNom() + ", PRENOM : " + c.getPrenom());
			
			HttpSession session = request.getSession(true);
			session.setAttribute("client", c);
			
			response.sendRedirect(request.getContextPath() + "/jsp/pagePrincipale.jsp");
		} catch (BankonetException e) {
			System.out.println("Connexion impossible");
			//e.printStackTrace();
			response.sendRedirect(request.getContextPath() + "/jsp/erreur.jsp");
		}
	}

}
