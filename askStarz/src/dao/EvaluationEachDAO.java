package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ibatis.sqlmap.client.SqlMapClient;

import dto.EvaluationEach;

public class EvaluationEachDAO {
	private SqlMapClient sqlMapper;
	private static EvaluationEachDAO instance;
	
	private EvaluationEachDAO(){
		sqlMapper = DAOParser.getParser();
	}
	
	public static EvaluationEachDAO getInstance(){
		
		if(instance == null) instance = new EvaluationEachDAO();
		return instance;
	}
	
	public ArrayList<EvaluationEach> getListByGreat(){
		ArrayList<EvaluationEach> getListGreat = new ArrayList<EvaluationEach>();
		
		try {
			getListGreat = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByGreat");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListGreat;
	}
	
	public ArrayList<EvaluationEach> getListByHot(){
		ArrayList<EvaluationEach> getListHot = new ArrayList<EvaluationEach>();
		
		try {
			getListHot = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByHot");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListHot;
	}

}
