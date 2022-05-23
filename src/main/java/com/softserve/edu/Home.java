package com.softserve.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet({ "/Home", "/home", "/" })
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String box = ""; // Architecture Error
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    if ((request.getParameter("box") != null)
                && (!request.getParameter("box").isEmpty())) {
            box = request.getParameter("box");
        }
        //
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Map.Entry<String, String[]> param : requestParams.entrySet()) {
            System.out.println(param.getKey() + " => " + Arrays.toString(param.getValue()));
        }
        //
        //response.setContentType("application/zip; charset=UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        //
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello</h1><br><br><br>");
        out.println("<br><font size=\"5\" color='red'> URL = " + request.getRequestURL().toString() + "</font><br>");
        out.println("<br><font size=\"5\" color='green'> URI = " + request.getRequestURI().toString() + "</font><br>");
        if (box.length() > 0) {
            out.println("<br><br>box=" + box + "<br><br><br>");
        }
        out.println("</body>");
        out.println("</html>");
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
