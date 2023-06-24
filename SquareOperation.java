package firstwebdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareOperation extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		double value =(double)req.getAttribute("c");
		PrintWriter out = res.getWriter();
		out.print("sqaure value : " + Math.pow(value, 2));
		
	}
}
