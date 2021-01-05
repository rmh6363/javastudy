package kr.co.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.command.Command;
import kr.co.dao.MemberDAO;

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
		response.setContentType("text/html; charset = utf-8");
		String uri = request.getRequestURI();
		String cp = request.getContextPath();
		String sp = uri.substring(cp.length());
		Command cmd = null;
		MemberDAO dao = new MemberDAO();
		Map<String, String> menu =dao.menuMap();
		String fullname= menu.get(sp.toLowerCase());
		
		if (fullname != null) {
			try {
				Class<?> testclass= Class.forName(fullname);
				Constructor<?> con = testclass.getConstructor();
				cmd = (Command) con.newInstance();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			CommandAction action= cmd.execute(request, response);
			if (action.isIsredirect()) {
				response.sendRedirect(action.getWhere());
			} else {
				RequestDispatcher dis= request.getRequestDispatcher(action.getWhere());
				dis.forward(request, response);
			}
		} else {
			System.out.println("지원하지 않는 서비스입니");
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
