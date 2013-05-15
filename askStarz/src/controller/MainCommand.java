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
		String status = request.getParameter("status");
		String which = request.getParameter("which");
		String schoolSeq = request.getParameter("schoolSeq");
		System.out.println(schoolSeq);
		System.out.println(status);
		ArrayList<EvaluationEach> listByGreat = null;
		ArrayList<EvaluationEach> listByHot = null;
		ArrayList<EvaluationEach> listByWeek = null;
		ArrayList<EvaluationEach> listByUnderstand = null;
		ArrayList<EvaluationEach> listByHappy = null;
		try {
			//검색단어가 아무것도 없을때
			//즉, 첫 로딩화면
			if(status.equals("none")){
			listByGreat = new StarService().getListByGreat();
			listByHot = new StarService().getListByHot();
			listByWeek = new StarService().getListByWeek();
			listByUnderstand = new StarService().getListByUnderstand();
			listByHappy = new StarService().getListByHappy();
			}
			
			//검색단어가 학교정보일때
			else if(status.equals("school")){
			listByGreat = new StarService().getListByGreatSchool(schoolSeq);
			listByHot = new StarService().getListByHotSchool(schoolSeq);
			listByWeek = new StarService().getListByWeekSchool(schoolSeq);
			listByUnderstand = new StarService().getListByUnderstandSchool(schoolSeq);
			listByHappy = new StarService().getListByHappySchool(schoolSeq);
			if(listByGreat.size() == 0){
				nextPage = "noSearchmainWeb.jsp";
			}
			}
			
			System.out.println(listByGreat);
			
			System.out.println(nextPage);
			
			if(listByGreat.size() !=0 && which.equals("web")){
				request.setAttribute("listByGreat", listByGreat);
				request.setAttribute("listByHot", listByHot);
				request.setAttribute("listByWeek", listByWeek);
				request.setAttribute("listByUnderstand", listByUnderstand);
				request.setAttribute("listByHappy", listByHappy);
				nextPage = "mainWeb.jsp";
			}
				
		} catch (EvaluationEachException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(nextPage);
		
		return nextPage;
	}

}
