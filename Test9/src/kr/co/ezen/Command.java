package kr.co.ezen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	public abstract void execute(HttpServletRequest request, HttpServletResponse response);

}
