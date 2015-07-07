package com.bankonet.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */

public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
     * @throws ServletException 
     * @see HttpServlet#init(ServletConfig conf)
     */
    public void init(ServletConfig conf) throws ServletException{
    	super.init(conf);
    	System.out.println("Initialisation de DateServlet");
    }
    
    /**
     * @throws ServletException 
     * @see HttpServlet#init(ServletConfig conf)
     */
    public void destroy(){
    	System.out.println("Suppression de DateServlet");
    	super.destroy();
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
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println(sdf.format(new Date()));

		RequestDispatcher disp = req.getRequestDispatcher("/jsp/login.jsp");
		disp.forward(req, resp);
		//resp.sendRedirect(req.getContextPath() + "/jsp/login.jsp");
	
	}

}
