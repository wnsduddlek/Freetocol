package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ibatis.sqlmap.client.SqlMapClient;

import dto.Evaluation;

public class EvaluationDAO {
	private SqlMapClient sqlMapper;
	private static EvaluationDAO instance;
	
	private EvaluationDAO(){
		sqlMapper = DAOParser.getParser();
	}
	
	public static EvaluationDAO getInstance(){
		if(instance == null) instance = new EvaluationDAO();
		return instance;
	}
	
	public void evaluationInsert(Evaluation evaluation){
		try {
			sqlMapper.insert("evaluationInsert", evaluation);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void evaluationAdminInsert(int professorCode){
		try {
			sqlMapper.insert("evaluationAdminInsert", professorCode);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public ArrayList<Evaluation> evaluationPerProfessor(int professorCode){
		ArrayList<Evaluation> evaluationList = new ArrayList<Evaluation>();
		
		try {
			evaluationList = (ArrayList<Evaluation>) sqlMapper.queryForList("evaluationPerProfessor", professorCode);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return evaluationList;
	}
}
