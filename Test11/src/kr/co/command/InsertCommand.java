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
	public CommandAction execute(HttpServletRequest requset, HttpServletResponse response)
			throws IOException, ServletException {
		//1. client가 보내준 데이터 획득 및 가공
		String id =requset.getParameter("id");
		String name = requset.getParameter("name");
		String sAge = requset.getParameter("age");
		int age =Integer.parseInt(sAge);
		
		
		//2. DAO 객체 생성 및 해당 메서드 호출
		MemberDAO dao = new MemberDAO();
		dao.Insert(new MemberDTO(id, name, age));
		
		//4. 포워딩 작업 -> 입력 후에는 목록으로 감. list.jsp|| list.do
		// redirect || dispatcher인지 확인
		//data binding된게없음
		// insert.do ==>목록으로 가는데, list.jsp list.do
		// 목록 화면인데 주소가 insert.do라면 이상함.
		// 이상하지 않게 하려면, list~
		
		return new CommandAction(true, "list.do");
	}

}
