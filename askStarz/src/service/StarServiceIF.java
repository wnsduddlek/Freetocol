package service;

import java.util.ArrayList;

import dto.EvaluationEach;
import dto.Member;
import exception.EvaluationEachException;
import exception.MemberException;

public interface StarServiceIF {
	public boolean loginCheck(Member userInfo) throws MemberException;
	public Member sessionInfo(String eMail) throws MemberException;
	public ArrayList<EvaluationEach> getListByGreat() throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByHot() throws EvaluationEachException;
}
