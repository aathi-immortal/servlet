package firstwebdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddOperation  extends HttpServlet{
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
//	{
//	
//		
//	}
	public void add(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		Double a,b;
		a = Double.parseDouble(req.getParameter("value1"));
		b = Double.parseDouble(req.getParameter("value2"));
		double c = a + b;
		PrintWriter out = res.getWriter();
		out.print("value is :" + c);
		res.sendRedirect("square?c="+c); //url writing
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		
		
		add(req,res);
		
//		RequestDispatcher red = req.getRequestDispatcher("square");
//		red.forward(req, res);
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		add(req,res);
	}
}
