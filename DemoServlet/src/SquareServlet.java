import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	/*Lifecycle of Servlet*/
	//init
	//service
	//destroy
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		{
		// TODO Auto-generated method stub
		
		// Request Dispatcer
		// int k = (int)req.getAttribute("k");
		
		// Redirect URL Rewriting
		// int k = Integer.parseInt(req.getParameter("k"));
		
		// Redirect Session Management 
		//HttpSession session = req.getSession();
		//int k = Integer.parseInt(session.getAttribute("k").toString());
			
		Cookie cookies[] = req.getCookies();
		
		int k = 0;
		for(Cookie c : cookies)
		{
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
	 
			
		PrintWriter out = null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		k = k*k;
			out.println("Result is "+k);
			
			//session.removeAttribute("k");
			
	}
}
}