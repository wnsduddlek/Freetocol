package dto;

import java.io.Serializable;

public class EvaluationEach implements Serializable {
	private int professorCode;
	private String professorName;
	private int greatScore;
	private int hotScore;
	private int weekScore;
	private int understandScore;
	private int happyScore;
	private String schoolSeq;
	private String majorSeq;
	private String schoolName;
	private String majorName;
	public EvaluationEach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EvaluationEach(int professorCode, String professorName,
			int greatScore, int hotScore, int weekScore, int understandScore,
			int happyScore, String schoolSeq, String majorSeq,
			String schoolName, String majorName) {
		super();
		this.professorCode = professorCode;
		this.professorName = professorName;
		this.greatScore = greatScore;
		this.hotScore = hotScore;
		this.weekScore = weekScore;
		this.understandScore = understandScore;
		this.happyScore = happyScore;
		this.schoolSeq = schoolSeq;
		this.majorSeq = majorSeq;
		this.schoolName = schoolName;
		this.majorName = majorName;
	}
	@Override
	public String toString() {
		return "EvaluationEach [professorCode=" + professorCode
				+ ", professorName=" + professorName + ", greatScore="
				+ greatScore + ", hotScore=" + hotScore + ", weekScore="
				+ weekScore + ", understandScore=" + understandScore
				+ ", happyScore=" + happyScore + ", schoolSeq=" + schoolSeq
				+ ", majorSeq=" + majorSeq + ", schoolName=" + schoolName
				+ ", majorName=" + majorName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + greatScore;
		result = prime * result + happyScore;
		result = prime * result + hotScore;
		result = prime * result
				+ ((majorName == null) ? 0 : majorName.hashCode());
		result = prime * result
				+ ((majorSeq == null) ? 0 : majorSeq.hashCode());
		result = prime * result + professorCode;
		result = prime * result
				+ ((professorName == null) ? 0 : professorName.hashCode());
		result = prime * result
				+ ((schoolName == null) ? 0 : schoolName.hashCode());
		result = prime * result
				+ ((schoolSeq == null) ? 0 : schoolSeq.hashCode());
		result = prime * result + understandScore;
		result = prime * result + weekScore;
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
		EvaluationEach other = (EvaluationEach) obj;
		if (greatScore != other.greatScore)
			return false;
		if (happyScore != other.happyScore)
			return false;
		if (hotScore != other.hotScore)
			return false;
		if (majorName == null) {
			if (other.majorName != null)
				return false;
		} else if (!majorName.equals(other.majorName))
			return false;
		if (majorSeq == null) {
			if (other.majorSeq != null)
				return false;
		} else if (!majorSeq.equals(other.majorSeq))
			return false;
		if (professorCode != other.professorCode)
			return false;
		if (professorName == null) {
			if (other.professorName != null)
				return false;
		} else if (!professorName.equals(other.professorName))
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		if (schoolSeq == null) {
			if (other.schoolSeq != null)
				return false;
		} else if (!schoolSeq.equals(other.schoolSeq))
			return false;
		if (understandScore != other.understandScore)
			return false;
		if (weekScore != other.weekScore)
			return false;
		return true;
	}
	public int getProfessorCode() {
		return professorCode;
	}
	public void setProfessorCode(int professorCode) {
		this.professorCode = professorCode;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public int getGreatScore() {
		return greatScore;
	}
	public void setGreatScore(int greatScore) {
		this.greatScore = greatScore;
	}
	public int getHotScore() {
		return hotScore;
	}
	public void setHotScore(int hotScore) {
		this.hotScore = hotScore;
	}
	public int getWeekScore() {
		return weekScore;
	}
	public void setWeekScore(int weekScore) {
		this.weekScore = weekScore;
	}
	public int getUnderstandScore() {
		return understandScore;
	}
	public void setUnderstandScore(int understandScore) {
		this.understandScore = understandScore;
	}
	public int getHappyScore() {
		return happyScore;
	}
	public void setHappyScore(int happyScore) {
		this.happyScore = happyScore;
	}
	public String getSchoolSeq() {
		return schoolSeq;
	}
	public void setSchoolSeq(String schoolSeq) {
		this.schoolSeq = schoolSeq;
	}
	public String getMajorSeq() {
		return majorSeq;
	}
	public void setMajorSeq(String majorSeq) {
		this.majorSeq = majorSeq;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	
	
	
	
}
