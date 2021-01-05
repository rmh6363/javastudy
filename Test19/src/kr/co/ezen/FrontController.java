package kr.co.ezen;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.awt.RepaintArea;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("html/txt; charset = utf-8");
		
		String uri = request.getRequestURI();
		String cp = request.getContextPath();
		String sp = uri.substring(cp.length());
		Command com = null;
		
		if (com != null) {
			CommandAction action= com.execute(request, response);
			if (action.isRedirect()) {
				response.sendRedirect(action.getWhere());
			} else {
				RequestDispatcher   dis = request.getRequestDispatcher(action.getWhere());
				dis.forward(request, response);
				
			}
		} else {
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("지원하지 않는 서비스 입니다.");
			out.print("</body>");
			out.print("</html>");
		}
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
