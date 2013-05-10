package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String nextPage = null;
		
		String which = request.getParameter("which");
		
		if(which.equals("web")){
		nextPage = "mainWeb.jsp";
		}
		
		return nextPage;
	}

}
