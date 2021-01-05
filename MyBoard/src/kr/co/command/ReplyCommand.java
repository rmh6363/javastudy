package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dao.BoardDAO;
import kr.co.domain.BoardDTO;
import kr.co.domain.CommandAction;

public class ReplyCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		String snum = request.getParameter("num");
		int orinum = Integer.parseInt(snum);
		
		BoardDTO repDTO = new BoardDTO(-1, author, title, content, null, -1, -1, -1, -1);
		new BoardDAO().reply(orinum,repDTO);
		
		return new CommandAction(true, "list.do");
	}

}
