package com.virtusa.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.web.model.PatientDao;

/**
 * Servlet implementation class LoginDetailsController
 */
public class LoginDetailsController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		try
		{	    
			
		     Patient p = new Patient();
		     p.setId(Integer.parseInt(request.getParameter("id")));
		     p.setPassword(request.getParameter("pass"));

		     p = PatientDao.login(p);
			   		    
		     if (p.isValid())
		     {
		    	 HttpSession session = request.getSession(true);	    
		         session.setAttribute("a1",p); 
		    	 RequestDispatcher rd = request.getRequestDispatcher("ShowPatientDetails.jsp");
		          rd.forward(request, response);
		         //response.sendRedirect("ShowPatientDetails.jsp"); 
		     }
			        
		     else 
		     {
		    	 RequestDispatcher rd = request.getRequestDispatcher("InvalidPassword.jsp");
		          rd.forward(request, response); 
		     }
		} 
				
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
		       
	}

}
