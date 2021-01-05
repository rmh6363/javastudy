package kr.co.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dao.MemberDAO;
import kr.co.domain.CommandAction;
import kr.co.domain.MemberDTO;

public class ListCommand implements Command{

	@Override
	public CommandAction execute(HttpServletRequest requset, HttpServletResponse response)
			throws IOException, ServletException {
		
		// 2. DAO 객체 생성 및 해당 메서드 호출
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.list();
		// 3. 데이터 바인딩
		requset.setAttribute("list",list);
		// 4. 포워딩
		return new CommandAction(false, "list.jsp");
	}

}
