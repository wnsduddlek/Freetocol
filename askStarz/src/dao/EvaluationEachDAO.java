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
	
	public ArrayList<EvaluationEach> getListByWeek(){
		ArrayList<EvaluationEach> getListWeek = new ArrayList<EvaluationEach>();
		
		try {
			getListWeek = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByWeek");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListWeek;
	}
	
	public ArrayList<EvaluationEach> getListByUnderstand(){
		ArrayList<EvaluationEach> getListUnderstand = new ArrayList<EvaluationEach>();
		
		try {
			getListUnderstand = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByUnderstand");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListUnderstand;
	}
	
	public ArrayList<EvaluationEach> getListByHappy(){
		ArrayList<EvaluationEach> getListHappy = new ArrayList<EvaluationEach>();
		
		try {
			getListHappy = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByHappy");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListHappy;
	}
	
	
	public ArrayList<EvaluationEach> getListByGreatSchool(String schoolSeq){
		ArrayList<EvaluationEach> getListGreat = new ArrayList<EvaluationEach>();
		
		try {
			getListGreat = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByGreatSchool", schoolSeq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListGreat;
	}
	
	public ArrayList<EvaluationEach> getListByHotSchool(String schoolSeq){
		ArrayList<EvaluationEach> getListHot = new ArrayList<EvaluationEach>();
		
		try {
			getListHot = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByHotSchool", schoolSeq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListHot;
	}
	
	public ArrayList<EvaluationEach> getListByWeekSchool(String schoolSeq){
		ArrayList<EvaluationEach> getListWeek = new ArrayList<EvaluationEach>();
		
		try {
			getListWeek = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByWeekSchool", schoolSeq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListWeek;
	}
	
	public ArrayList<EvaluationEach> getListByUnderstandSchool(String schoolSeq){
		ArrayList<EvaluationEach> getListUnderstand = new ArrayList<EvaluationEach>();
		
		try {
			getListUnderstand = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByUnderstandSchool", schoolSeq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListUnderstand;
	}
	
	public ArrayList<EvaluationEach> getListByHappySchool(String schoolSeq){
		ArrayList<EvaluationEach> getListHappy = new ArrayList<EvaluationEach>();
		
		try {
			getListHappy = (ArrayList<EvaluationEach>)sqlMapper.queryForList("getListByHappySchool", schoolSeq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getListHappy;
	}

}
