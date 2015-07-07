package com.bankonet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bankonet.model.Client;
import com.bankonet.model.CompteEpargne;

/**
 * Servlet implementation class DetailCompteEpargneServlet
 */
public class DetailCompteEpargneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailCompteEpargneServlet() {
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
		HttpSession session = request.getSession();
		if(session != null){
			Client client = (Client) session.getAttribute("client");
			CompteEpargne compteEpargne = (CompteEpargne) client.getCompte(Integer.parseInt(request.getParameter("id")));
			session.setAttribute("compteEpargne", compteEpargne);
			//response.sendRedirect(request.getContextPath() + "/jsp/detailCompteEpargne.jsp");
			RequestDispatcher disp = this.getServletContext().getRequestDispatcher("/jsp/detailCompteEpargne.jsp");
			disp.forward(request, response);
		} else {
			RequestDispatcher disp = this.getServletContext().getRequestDispatcher("/");
			disp.forward(request, response);
		}
	}

}
