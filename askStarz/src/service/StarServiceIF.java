package service;

import dto.Member;
import exception.MemberException;

public interface StarServiceIF {
	public boolean loginCheck(Member userInfo) throws MemberException;
	public Member sessionInfo(String eMail) throws MemberException;
}
