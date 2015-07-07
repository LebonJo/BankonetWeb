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
import com.bankonet.model.CompteCourant;
import com.bankonet.model.CompteEpargne;

/**
 * Servlet implementation class DetailCompteCourantServlet
 */
public class DetailCompteCourantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailCompteCourantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session != null){
			Client client = (Client) session.getAttribute("client");
			CompteCourant compteCourant = (CompteCourant) client.getCompte(Integer.parseInt(request.getParameter("id")));
			request.setAttribute("compteCourant", compteCourant);
			//response.sendRedirect(request.getContextPath() + "/jsp/detailCompteCourant.jsp");
			RequestDispatcher disp = this.getServletContext().getRequestDispatcher("/jsp/detailCompteCourant.jsp");
			disp.forward(request, response);
		} else {
			RequestDispatcher disp = this.getServletContext().getRequestDispatcher("/");
			disp.forward(request, response);
		}
	}

}
