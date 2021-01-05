package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.domain.CommandAction;

public class InsertUICommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// 1. client가 보내준 데이터 획득 및 가공
		// 2. DAO 객체 생성 및 해당 메서드 호출
		// 3. data binding 
		// -jsp에 정보를 넘기기 위해서 request,session(로그인),application(방문자수)
		// 4. forwarding작업
		// -만약에 request에 바인딩하면,dispatcher
		// -바인딩 안 한다. 주소가 바뀌어야 정상적으로 느껴지는 경우 100% redirect
		return new CommandAction(true, "insertui.jsp");
		//.do 데이터 가져올수있음
	}

}
