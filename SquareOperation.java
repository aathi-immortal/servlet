package firstwebdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareOperation extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		double value =Double.parseDouble(req.getParameter("c"));
		PrintWriter out = res.getWriter();
		out.print("sqaured values is:"+ (Math.pow(value, 2)));
		
	}
}
