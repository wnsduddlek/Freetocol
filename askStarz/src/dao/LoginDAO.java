package dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import dto.Member;
import exception.RecordNotFoundException;

public class LoginDAO {
	private SqlMapClient sqlMapper;
	private static LoginDAO instance;
	
	private LoginDAO(){
		sqlMapper = DAOParser.getParser();
	}
	
	public static LoginDAO getInstance(){
		if(instance == null) instance = new LoginDAO();
		return instance;
	}
	
	public boolean loginCheck(Member userInfo){
		boolean flag = false;
		
		try {
			String result = (String)sqlMapper.queryForObject("loginCheck", userInfo);
			if(result != null) flag = true;
		} catch (SQLException e) {
			new RecordNotFoundException("아이디를 찾을 수 없습니다ㅠㅜ");
		}
		
		
		return flag;
	}
}
