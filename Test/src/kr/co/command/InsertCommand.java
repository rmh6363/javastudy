package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.controller.CommandAction;
import kr.co.dao.MemberDAO;
import kr.co.dto.MemberDTO;

public class InsertCommand implements Command{

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sage = request.getParameter("age");
		int age = Integer.parseInt(sage);
		MemberDTO dto = new MemberDTO(id, name, age);
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
		
		
		return new CommandAction("list.do", true);
	}

}
