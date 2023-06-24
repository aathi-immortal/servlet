package firstwebdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareOperation extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		HttpSession session = req.getSession();
		double value =(double)session.getAttribute("c");
		PrintWriter out = res.getWriter();
		out.print("sqaured values is:"+ (Math.pow(value, 2)));
		
	}
}
