package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cs",urlPatterns = {"/test"})
public class test extends HttpServlet{
	
	
	
   private static final long serialVersionUID= 1L;
   private int nbrOfVisitors;
	
	@Override
	public void init() {
		nbrOfVisitors=1;
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("/pages/hello.jsp");
		rd.forward(req, resp);
		/*String nom=req.getParameter("nom") ;
		PrintWriter out=resp.getWriter();
		out.println("<html><body>");
		//out.println("<h1>"+nom+"<h1>");
		out.println("</body></html>");*/
	}

}
