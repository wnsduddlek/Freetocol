package dao;

import java.sql.SQLException;

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
}
