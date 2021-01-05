package kr.co.ezen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		int age = Integer.parseInt(pw);
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setId(id);
		loginDTO.setAge(age);
		MemberDAO dao = new MemberDAO();
		LoginDTO newDTO= dao.login(loginDTO);
		HttpSession session = request.getSession();//request.getSession(true);
		// session이 있으면, 있는 것을 넘겨주고
		// session이 없으면, 새로 만들어서 넘겨주세요
		//request.getSession(true);session이 있을 때만 넘겨 주고, 없으면 null을 넘겨라
		session.setAttribute("newDTO", newDTO);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
