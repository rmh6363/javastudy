package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.domain.CommandAction;

public class LogoutCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession(false);
		if (session!=null) {
			session.invalidate();
			//session.removeAttribute("login");
			return new CommandAction(true, "list.do");
		}
		return new CommandAction(true, "list.do");
	}

}
