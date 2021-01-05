package kr.co.ezen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YourServlet
 */
public class YourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset = utf-8");
		String username = getInitParameter("username");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print(name);
		out.print("<br>");
		out.print(address);
		out.print("<br>");
		out.print(username);
		out.print("</body>");
		out.print("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		String school = request.getParameter("school");
		String[] hobby = request.getParameterValues("hobby");
		out.print("<html>");
		out.print("<body>");
		out.print(school+"<br>");
		for (int i = 0; i < hobby.length; i++) {
			out.print(hobby[i]);
			out.print("<br>");
		}
		out.print("</bodyl>");
		out.print("</html>");
		
	}

}
