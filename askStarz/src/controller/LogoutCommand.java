package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nextPage = null;
		
		HttpSession session = request.getSession(false);
		if(session != null){
		session.invalidate();
		}
		nextPage = "loadingWeb.jsp";
		return nextPage;
	}

}
