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
	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evaluation(int evaluationCode, int professorCode, int greatScore,
			int hotScore, int weekScore, int understandScore, int happyScore,
			String comment, int guestCode, String eMail,
			String profileImageFile, int trackback) {
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
	}
	
	
	public Evaluation(int professorCode, int greatScore, int hotScore,
			int weekScore, int understandScore, int happyScore, String comment,
			int guestCode, String eMail, String profileImageFile, int trackback) {
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
		result = prime * result + professorCode;
		result = prime
				* result
				+ ((profileImageFile == null) ? 0 : profileImageFile.hashCode());
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
		if (professorCode != other.professorCode)
			return false;
		if (profileImageFile == null) {
			if (other.profileImageFile != null)
				return false;
		} else if (!profileImageFile.equals(other.profileImageFile))
			return false;
		if (trackback != other.trackback)
			return false;
		if (understandScore != other.understandScore)
			return false;
		if (weekScore != other.weekScore)
			return false;
		return true;
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
				+ trackback + "]";
	}
	
	
}
