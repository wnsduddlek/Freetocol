package service;

import dao.LoginDAO;
import dao.MemberDAO;
import dto.Member;
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

}
