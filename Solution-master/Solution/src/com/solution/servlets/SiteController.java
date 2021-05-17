package com.solution.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.solution.connection.ConnectionProvider;

/**
 * Servlet implementation class SiteController
 */
public class SiteController extends HttpServlet {
	
	static final Logger LOGGER = Logger.getLogger(SiteController.class);
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String action=request.getParameter("action");
		Connection con= new ConnectionProvider().getConnection();
		if(action.equals("login")) {
			LOGGER.info("Opened Login Page ");
			response.sendRedirect("login.jsp");
		}
		else if(action.equals("customerlogin")) {
			LOGGER.info(" Open customer login ");
			response.sendRedirect("customerlogin.jsp");
		}
		else if(action.equals("shopperlogin")) {
			LOGGER.info("Open shopper login");
			response.sendRedirect("shopperlogin.jsp");
		}
		else if(action.equals("signup")) {
			LOGGER.info(" Open signUp page");
			response.sendRedirect("signup.jsp");
		}
		else if(action.equals("customersignup")) {
			LOGGER.info(" Open customer sign up");
			response.sendRedirect("customersignup.jsp");
		}
		else if(action.equals("shoppersignup")) {
			LOGGER.info(" Open Shopper sign up");
			response.sendRedirect("shoppersignup.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
