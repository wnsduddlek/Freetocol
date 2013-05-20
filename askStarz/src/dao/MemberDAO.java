package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.ibatis.sqlmap.client.SqlMapClient;

import dto.Member;

public class MemberDAO {
	private SqlMapClient sqlMapper;
	private static MemberDAO instance;
	
	private MemberDAO(){
		sqlMapper = DAOParser.getParser();
	}
	
	public static MemberDAO getInstance(){
		
		if(instance == null) instance = new MemberDAO();
		return instance;
	}
	
	public Member sessionInfo(String eMail){
		Member sessionInfo = new Member();
		
		try {
			sessionInfo = (Member)sqlMapper.queryForObject("sessionInfo", eMail);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sessionInfo;
	}
	
	public void memberInsert(Member member){
		
		try {
			sqlMapper.insert("memberInsert", member);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void memberUpdate(String check, HashMap<String, Object> memberList){
		if(check.equals("schoolName")){
			try {
				sqlMapper.update("memberSchoolNameUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(check.equals("schoolSeq")){
			try {
				sqlMapper.update("memberSchoolSeqUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(check.equals("nickName")){
			try {
				sqlMapper.update("memberNickNameUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(check.equals("majorName")){
			try {
				sqlMapper.update("memberMajorNameUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(check.equals("majorSeq")){
			try {
				sqlMapper.update("memberMajorSeqUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(check.equals("memberCode")){
			try {
				sqlMapper.update("memberMemberCodeUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(check.equals("studentNumber")){
			try {
				sqlMapper.update("memberStudentNumberUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(check.equals("registerTime")){
			try {
				sqlMapper.update("memberRegisterTimeUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(check.equals("point")){
			try {
				sqlMapper.update("memberPointUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(check.equals("personaconCode")){
			try {
				sqlMapper.update("memberPersonaconCodeUpdate", memberList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public ArrayList<Member> memberListAdmin(){
		ArrayList<Member> memberList = new ArrayList<Member>();
		
		try {
			memberList = (ArrayList<Member>)sqlMapper.queryForList("memberListAdmin");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memberList;
		
	}
}
