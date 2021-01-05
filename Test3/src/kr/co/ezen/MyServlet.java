package kr.co.ezen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = utf-8");
		
		ServletContext application = getServletContext();
		String drivername = application.getInitParameter("drivername");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("안녕");
		out.print("<br>");
		out.print(drivername);
		out.print("<body>");
		out.print("<html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset = utf-8");
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("식사하셨습니까?<br>");
		out.print(id+"<br>");
		out.print(pw+"<br>");
		out.print("</body>");
		out.print("/<html>");
	}

}
