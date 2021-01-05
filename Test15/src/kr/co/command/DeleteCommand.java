package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.dao.MemberDAO;
import kr.co.domain.CommandAction;
import kr.co.domain.MemberDTO;

public class DeleteCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		if (session==null) {
			return new CommandAction(true, "login.jsp");
		}
		LoginDTO login = (LoginDTO) session.getAttribute("login");
		if (login==null) {
			return new CommandAction(true, "login.jsp");
		}
		if (!id.equals(login.getId())) {
			return new CommandAction(true, "loginui.do");
		}
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
		
		return new CommandAction(true, "list.do");
	}

}
