package kr.co.command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dao.MemberDAO;
import kr.co.domain.CommandAction;
import kr.co.domain.MemberDTO;

public class ReadCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String id = request.getParameter("id");
		
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.read(id);
		request.setAttribute("dto", dto);
		return new CommandAction(false, "read.jsp");
	}

}
