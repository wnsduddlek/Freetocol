package service;

import java.util.ArrayList;

import dao.EvaluationEachDAO;
import dao.LoginDAO;
import dao.MemberDAO;
import dto.EvaluationEach;
import dto.Member;
import exception.EvaluationEachException;
import exception.MemberException;

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

}
