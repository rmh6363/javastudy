package kr.co.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dao.BoardDAO;
import kr.co.domain.BoardDTO;
import kr.co.domain.CommandAction;

public class SearchCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String searchOption = request.getParameter("searchoption");
		String searchKeyword = request.getParameter("searchkeyword");
		
		
		List<BoardDTO> list = new BoardDAO().search(searchOption, searchKeyword);
		request.setAttribute("list", list);
		
		
		
		return new CommandAction(false, "search.jsp");
	}

}
