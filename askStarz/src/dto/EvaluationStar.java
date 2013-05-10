package dto;

import java.io.Serializable;

public class EvaluationStar implements Serializable {
	private int starCode;
	private String eMail;
	private int evaluationCode;
	public int getStarCode() {
		return starCode;
	}
	public void setStarCode(int starCode) {
		this.starCode = starCode;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getEvaluationCode() {
		return evaluationCode;
	}
	public void setEvaluationCode(int evaluationCode) {
		this.evaluationCode = evaluationCode;
	}
	public EvaluationStar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EvaluationStar(int starCode, String eMail, int evaluationCode) {
		super();
		this.starCode = starCode;
		this.eMail = eMail;
		this.evaluationCode = evaluationCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result + evaluationCode;
		result = prime * result + starCode;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EvaluationStar other = (EvaluationStar) obj;
		if (eMail == null) {
			if (other.eMail != null)
				return false;
		} else if (!eMail.equals(other.eMail))
			return false;
		if (evaluationCode != other.evaluationCode)
			return false;
		if (starCode != other.starCode)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "evaluationStar [starCode=" + starCode + ", eMail=" + eMail
				+ ", evaluationCode=" + evaluationCode + "]";
	}
	
}
