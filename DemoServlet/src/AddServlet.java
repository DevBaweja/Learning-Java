import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class AddServlet extends HttpServlet
{

	/* we use doPost , doGet
	 * in that case access is granted when it matches the request
	 * so in case of password we use post request ie doPost method
	 * it will only work with post method for security purpose maybe
	*/ 
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		// calling one servlet in another servlet 
		// Redirect 
		/*
		 try {
			res.sendRedirect("sq?k="+k); // URL Rewriting
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		// Redirect
		/*
		 HttpSession session = req.getSession();
		session.setAttribute("k", k);
		
		try {
			res.sendRedirect("sq"); // Session Management 
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// Redirect 
		/*
		 
		 */
		Cookie cookie = new Cookie("k", Integer.toString(k));
		res.addCookie(cookie);
		
		try {
			res.sendRedirect("sq");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Request Dispatcher
		/*
		 req.setAttribute("k", k);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
	}
	
}