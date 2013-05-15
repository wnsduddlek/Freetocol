package service;

import java.util.ArrayList;

import dto.EvaluationEach;
import dto.Member;
import dto.Professor;
import exception.EvaluationEachException;
import exception.MemberException;
import exception.ProfessorException;

public interface StarServiceIF {
	public boolean loginCheck(Member userInfo) throws MemberException;
	public Member sessionInfo(String eMail) throws MemberException;
	public ArrayList<EvaluationEach> getListByGreat() throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByHot() throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByWeek() throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByUnderstand() throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByHappy() throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByGreatSchool(String schoolCode) throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByHotSchool(String schoolCode) throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByWeekSchool(String schoolCode) throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByUnderstandSchool(String schoolCode) throws EvaluationEachException;
	public ArrayList<EvaluationEach> getListByHappySchool(String schoolCode) throws EvaluationEachException;
	public void memberInsert(Member member) throws MemberException;
	public boolean professorCheck(Professor professorInfo) throws ProfessorException;
	public void professorInsert(Professor professor) throws ProfessorException;
}
