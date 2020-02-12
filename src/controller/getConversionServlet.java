package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.modifier;

/**
 * Servlet implementation class getConversionServlet
 */
@WebServlet("/getConversionServlet")
public class getConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getConversionServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userInput = request.getParameter("userTemp");
		String userScale = request.getParameter("currentScale");
		
		modifier mod = new modifier(Double.parseDouble(userInput), userScale);
		
		request.setAttribute("modifierPouch", mod);
		
		getServletContext().getRequestDispatcher("/resultDegree.jsp").forward(request, response);
		//PrintWriter writer = response.getWriter();
		//writer.println(mod.toStringTwo());
		//writer.close();
	}

}
