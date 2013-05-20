package dto;

import java.io.Serializable;

public class Evaluation implements Serializable {
	private int evaluationCode;
	private int professorCode;
	private int greatScore;
	private int hotScore;
	private int weekScore;
	private int understandScore;
	private int happyScore;
	private String comment;
	private int guestCode;
	private String eMail;
	private String profileImageFile;
	private int trackback;
	private String registerTime;
	private String nickName;
	private int studentNumber;
	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Evaluation(int professorCode) {
		super();
		this.professorCode = professorCode;
	}

	public Evaluation(int professorCode, int greatScore, int hotScore,
			int weekScore, int understandScore, int happyScore, String comment,
			int guestCode, String eMail, String profileImageFile,
			int trackback, String nickName, int studentNumber) {
		super();
		this.professorCode = professorCode;
		this.greatScore = greatScore;
		this.hotScore = hotScore;
		this.weekScore = weekScore;
		this.understandScore = understandScore;
		this.happyScore = happyScore;
		this.comment = comment;
		this.guestCode = guestCode;
		this.eMail = eMail;
		this.profileImageFile = profileImageFile;
		this.trackback = trackback;
		this.nickName = nickName;
		this.studentNumber = studentNumber;
	}

	public Evaluation(int evaluationCode, int professorCode, int greatScore,
			int hotScore, int weekScore, int understandScore, int happyScore,
			String comment, int guestCode, String eMail,
			String profileImageFile, int trackback, String registerTime,
			String nickName, int studentNumber) {
		super();
		this.evaluationCode = evaluationCode;
		this.professorCode = professorCode;
		this.greatScore = greatScore;
		this.hotScore = hotScore;
		this.weekScore = weekScore;
		this.understandScore = understandScore;
		this.happyScore = happyScore;
		this.comment = comment;
		this.guestCode = guestCode;
		this.eMail = eMail;
		this.profileImageFile = profileImageFile;
		this.trackback = trackback;
		this.registerTime = registerTime;
		this.nickName = nickName;
		this.studentNumber = studentNumber;
	}
	@Override
	public String toString() {
		return "Evaluation [evaluationCode=" + evaluationCode
				+ ", professorCode=" + professorCode + ", greatScore="
				+ greatScore + ", hotScore=" + hotScore + ", weekScore="
				+ weekScore + ", understandScore=" + understandScore
				+ ", happyScore=" + happyScore + ", comment=" + comment
				+ ", guestCode=" + guestCode + ", eMail=" + eMail
				+ ", profileImageFile=" + profileImageFile + ", trackback="
				+ trackback + ", registerTime=" + registerTime + ", nickName="
				+ nickName + ", studentNumber=" + studentNumber + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result + evaluationCode;
		result = prime * result + greatScore;
		result = prime * result + guestCode;
		result = prime * result + happyScore;
		result = prime * result + hotScore;
		result = prime * result
				+ ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + professorCode;
		result = prime
				* result
				+ ((profileImageFile == null) ? 0 : profileImageFile.hashCode());
		result = prime * result
				+ ((registerTime == null) ? 0 : registerTime.hashCode());
		result = prime * result + studentNumber;
		result = prime * result + trackback;
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
		Evaluation other = (Evaluation) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (eMail == null) {
			if (other.eMail != null)
				return false;
		} else if (!eMail.equals(other.eMail))
			return false;
		if (evaluationCode != other.evaluationCode)
			return false;
		if (greatScore != other.greatScore)
			return false;
		if (guestCode != other.guestCode)
			return false;
		if (happyScore != other.happyScore)
			return false;
		if (hotScore != other.hotScore)
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (professorCode != other.professorCode)
			return false;
		if (profileImageFile == null) {
			if (other.profileImageFile != null)
				return false;
		} else if (!profileImageFile.equals(other.profileImageFile))
			return false;
		if (registerTime == null) {
			if (other.registerTime != null)
				return false;
		} else if (!registerTime.equals(other.registerTime))
			return false;
		if (studentNumber != other.studentNumber)
			return false;
		if (trackback != other.trackback)
			return false;
		if (understandScore != other.understandScore)
			return false;
		if (weekScore != other.weekScore)
			return false;
		return true;
	}
	public int getEvaluationCode() {
		return evaluationCode;
	}
	public void setEvaluationCode(int evaluationCode) {
		this.evaluationCode = evaluationCode;
	}
	public int getProfessorCode() {
		return professorCode;
	}
	public void setProfessorCode(int professorCode) {
		this.professorCode = professorCode;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getGuestCode() {
		return guestCode;
	}
	public void setGuestCode(int guestCode) {
		this.guestCode = guestCode;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getProfileImageFile() {
		return profileImageFile;
	}
	public void setProfileImageFile(String profileImageFile) {
		this.profileImageFile = profileImageFile;
	}
	public int getTrackback() {
		return trackback;
	}
	public void setTrackback(int trackback) {
		this.trackback = trackback;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
	
	
	
}
