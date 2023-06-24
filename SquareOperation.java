package firstwebdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareOperation extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		double value = 0;
		Cookie cookies[] = req.getCookies();
		PrintWriter out = res.getWriter();
		for(Cookie cookie : cookies)
		{
			if(cookie.getName().equals("c"))
			{
				value = Double.parseDouble(cookie.getValue());
			}
		}
		out.print("sqaure value is :" + (Math.pow(value, 2)));
	
		
	}
}
