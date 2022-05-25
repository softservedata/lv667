package com.softserve.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet({ "/Login", "/login", "/log" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    System.out.println("***doGet()");
	    getServletConfig().getServletContext()
	        .getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	    String name = request.getParameter("name");
        String password = request.getParameter("password");
        //String result = "invalid user or password";
        String result = "Error";
        if ((name != null) && (name.length() > 0)
                && (name.equalsIgnoreCase("ivan"))
                && (password != null) && (password.length() > 0)
                && (password.equalsIgnoreCase("qwerty"))) {
            result = "Welcome";
        }
        //
        if (!result.equals("Welcome")) {
            request.setAttribute("result", "Error");
            getServletConfig().getServletContext()
                .getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
        //
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello</h1><br><br><br>");
        if (result.equalsIgnoreCase("Welcome")) {
            out.println("<br><font size=\"5\" color='green'> Message = " + result + "</font><br>");
        } else {
            out.println("<br><font size=\"5\" color='red'> Message = " + result + "</font><br>");
        }
        out.println("</body>");
        out.println("</html>");
        out.close();
	}

}
