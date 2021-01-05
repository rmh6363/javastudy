package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import kr.co.dao.MemberDAO;
import kr.co.domain.CommandAction;
import kr.co.domain.MemberDTO;

public class InsertCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sAge = request.getParameter("age");
		int age = Integer.parseInt(sAge);
		MemberDTO dto = new MemberDTO(id, name, age);
		MemberDAO dao = new MemberDAO();
		dao.Insert(dto);
		
		return new CommandAction(true, "list.do");
		}

}
