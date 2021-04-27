package main.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String a = req.getParameter("quesone");
		String b = req.getParameter("questwo");
		String c = req.getParameter("questhree");
		
		PrintWriter out = res.getWriter();
		
		int score = 0;
		if(a.equals("a"))
		{
			score=score+10;
		}
		if(b.equals("c"))
		{
			score=score+10;
		}
		if(c.equals("a") || c.equals("b") || c.equals("c") || c.equals("d"))
		{
			score=score+10;
		}
		
		
		out.println("Your final score is: "+score+"/30");
	}
}
