package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.StarService;
import dto.Member;
import exception.MemberException;

public class LoginCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nextPage = null;
		
		//Web인지 mobile인지
		String which = request.getParameter("which");
		
		String eMail = request.getParameter("eMail");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession(true);
		
		//eMail주소가 존재하는지?
		try {
			boolean exist = new StarService().loginCheck(new Member(eMail, password));
			
			//존재한다면
			if(exist){
				Member sessionInfo = new StarService().sessionInfo(eMail);
				session.setAttribute("userInfo", sessionInfo);
				if(which.equals("web")){
					nextPage = "loadingWeb.jsp";
				}
			}
			else{
				nextPage = "noValidation.jsp";
			}
			
			
		} catch (MemberException e) {
			new MemberException("MEMBER EXCEPTION");
		}
		
		return nextPage;
	}

}
