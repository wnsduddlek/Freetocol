package service;

import java.util.ArrayList;

import dao.EvaluationEachDAO;
import dao.LoginDAO;
import dao.MemberDAO;
import dao.ProfessorDAO;
import dto.EvaluationEach;
import dto.Member;
import dto.Professor;
import exception.EvaluationEachException;
import exception.MemberException;
import exception.ProfessorException;

public class StarService implements StarServiceIF {

	@Override
	public boolean loginCheck(Member userInfo) throws MemberException {
		boolean flag = false;
		
		flag = LoginDAO.getInstance().loginCheck(userInfo);
		
		return flag;
	}

	@Override
	public Member sessionInfo(String eMail) throws MemberException {
		Member sessionInfo = null;
		
		sessionInfo = MemberDAO.getInstance().sessionInfo(eMail);
		
		return sessionInfo;
	}

	@Override
	public ArrayList<EvaluationEach> getListByGreat()
			throws EvaluationEachException {
		ArrayList<EvaluationEach> getListGreat = null;
		
		getListGreat = EvaluationEachDAO.getInstance().getListByGreat();
		
		return getListGreat;
	}

	@Override
	public ArrayList<EvaluationEach> getListByHot()
			throws EvaluationEachException {
		
		ArrayList<EvaluationEach> getListHot = null;
		
		getListHot = EvaluationEachDAO.getInstance().getListByHot();
		
		return getListHot;
	}

	@Override
	public ArrayList<EvaluationEach> getListByWeek()
			throws EvaluationEachException {
		ArrayList<EvaluationEach> getListWeek = null;
		
		getListWeek = EvaluationEachDAO.getInstance().getListByWeek();
		
		return getListWeek;
	}

	@Override
	public ArrayList<EvaluationEach> getListByUnderstand()
			throws EvaluationEachException {
		ArrayList<EvaluationEach> getListUnderstand = null;
		
		getListUnderstand = EvaluationEachDAO.getInstance().getListByUnderstand();
		
		return getListUnderstand;
	}

	@Override
	public ArrayList<EvaluationEach> getListByHappy()
			throws EvaluationEachException {
		ArrayList<EvaluationEach> getListHappy = null;
		
		getListHappy = EvaluationEachDAO.getInstance().getListByHappy();
		
		return getListHappy;
	}

	@Override
	public ArrayList<EvaluationEach> getListByGreatSchool(String schoolCode)
			throws EvaluationEachException {
		ArrayList<EvaluationEach> getListGreatSchool = null;
		
		getListGreatSchool = EvaluationEachDAO.getInstance().getListByGreatSchool(schoolCode);
		
		return getListGreatSchool;
	}

	@Override
	public ArrayList<EvaluationEach> getListByHotSchool(String schoolCode)
			throws EvaluationEachException {
		ArrayList<EvaluationEach> getListByHotSchool = null;
		
		getListByHotSchool = EvaluationEachDAO.getInstance().getListByHotSchool(schoolCode);
		
		return getListByHotSchool;
	}

	@Override
	public ArrayList<EvaluationEach> getListByWeekSchool(String schoolCode)
			throws EvaluationEachException {
		ArrayList<EvaluationEach> getListByWeekSchool = null;
		
		getListByWeekSchool = EvaluationEachDAO.getInstance().getListByWeekSchool(schoolCode);
		
		return getListByWeekSchool;
	}

	@Override
	public ArrayList<EvaluationEach> getListByUnderstandSchool(String schoolCode)
			throws EvaluationEachException {
		ArrayList<EvaluationEach> getListByUnderstandSchool = null;
		
		getListByUnderstandSchool = EvaluationEachDAO.getInstance().getListByUnderstandSchool(schoolCode);
		
		return getListByUnderstandSchool;
	}

	@Override
	public ArrayList<EvaluationEach> getListByHappySchool(String schoolCode)
			throws EvaluationEachException {
		ArrayList<EvaluationEach> getListByHappySchool = null;
		
		getListByHappySchool = EvaluationEachDAO.getInstance().getListByHappySchool(schoolCode);
		
		return getListByHappySchool;
	}

	@Override
	public void memberInsert(Member member) throws MemberException {
		MemberDAO.getInstance().memberInsert(member);
	}

	@Override
	public boolean professorCheck(Professor professorInfo)
			throws ProfessorException {
		boolean flag = false;
		flag = ProfessorDAO.getInstance().professorCheck(professorInfo);
		return flag;
	}

	@Override
	public void professorInsert(Professor professor) throws ProfessorException {
		
		ProfessorDAO.getInstance().professorInsert(professor);
	}

}
