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
import com.bankonet.model.Compte;
import com.bankonet.model.Virement;
import com.bankonet.service.BanqueService;
import com.bankonet.service.BanqueServiceManager;

/**
 * Servlet implementation class TraiterVirementServlet
 */
public class TraiterVirementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiterVirementServlet() {
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
		HttpSession session = request.getSession(true);
		Client client = (Client) session.getAttribute("client");
		
		Compte compteSource = client.getCompte(Integer.parseInt(request.getParameter("compteSource")));
		Compte compteDest = client.getCompte(Integer.parseInt(request.getParameter("compteDest")));
		float montant = new Float(request.getParameter("montant"));
		
		BanqueService banqueService = BanqueServiceManager.getBanqueService();
		
		try {
			Virement virement = banqueService.effectuerVirement(compteSource, compteDest, montant);
			request.getSession().setAttribute("virement", virement);
			response.sendRedirect(request.getContextPath() + "/jsp/virementEffectue.jsp");
		} catch (BankonetException e) {
			request.getSession().setAttribute("message", e.getMessage());
			response.sendRedirect(request.getContextPath() + "/jsp/erreurVirement.jsp");
		}
	}

}
