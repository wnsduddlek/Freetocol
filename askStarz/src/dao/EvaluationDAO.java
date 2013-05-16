package dao;

import java.sql.SQLException;

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
}
