package com.solution.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.solution.bean.Client;
import com.solution.bean.Item;
import com.solution.db.DBMImp;

/**
 * Servlet implementation class BuyItem
 */
public class BuyItem extends HttpServlet {
	static final Logger LOGGER = Logger.getLogger(BuyItem.class);
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Item item=new DBMImp().getItem(request.getParameter("itemname")); 
		int bquantity=Integer.parseInt(request.getParameter("itemno"));
		int newquantity=item.getQuantity()-bquantity;
		item.setQuantity(newquantity);
		boolean status = new DBMImp().updateItem(item);
		HttpSession hs = request.getSession();
		Client client = (Client)hs.getAttribute("client");
		boolean status1 = new DBMImp().insertLog(item, client, bquantity);
		
		if(status) {
			RequestDispatcher rd=request.getRequestDispatcher("category.jsp");
			out.print("<p>item bought....</p>");
			if(status1) {
				LOGGER.info("Log Updated");
				
				out.print("<p>Log Updated....</p>");
			}
			else {LOGGER.info("Faliure in log update ");
				out.print("<p>Log Update Failure....</p>");
			}
			rd.include(request, response);
		}
		else
		{LOGGER.info("Problem in buying item");
			out.print("<p>Problem in buying item..</p>");
			RequestDispatcher rd=request.getRequestDispatcher("category.jsp");
			rd.include(request, response);
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
