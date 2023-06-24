package firstwebdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
		Cookie cookie = new Cookie("c",c+"");
		res.addCookie(cookie);
		
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		
		
		add(req,res);
		res.sendRedirect("square");
//		RequestDispatcher red = req.getRequestDispatcher("square");
//		red.forward(req, res);
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		add(req,res);
	}
}
