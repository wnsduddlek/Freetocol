package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StarService;
import dto.EvaluationEach;
import exception.EvaluationEachException;

public class MainCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String nextPage = null;
		
		String which = request.getParameter("which");
		
		try {
			ArrayList<EvaluationEach> listByGreat = new StarService().getListByGreat();
			ArrayList<EvaluationEach> listByHot = new StarService().getListByHot();
			
			if(which.equals("web")){
				request.setAttribute("listByGreat", listByGreat);
				request.setAttribute("listByHot", listByHot);
				nextPage = "mainWeb.jsp";
			}
				
		} catch (EvaluationEachException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return nextPage;
	}

}
