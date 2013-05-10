package dto;

import java.io.Serializable;

public class Professor implements Serializable {
	private int professorCode;
	private String professorName;
	private String schoolName;
	private String schoolSeq;
	private String eMail;
	private String majorName;
	private String majorSeq;
	private String profileImage;
	private int approval;
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
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolSeq() {
		return schoolSeq;
	}
	public void setSchoolSeq(String schoolSeq) {
		this.schoolSeq = schoolSeq;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getMajorSeq() {
		return majorSeq;
	}
	public void setMajorSeq(String majorSeq) {
		this.majorSeq = majorSeq;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public int getApproval() {
		return approval;
	}
	public void setApproval(int approval) {
		this.approval = approval;
	}
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(int professorCode, String professorName,
			String schoolName, String schoolSeq, String eMail,
			String majorName, String majorSeq, String profileImage, int approval) {
		super();
		this.professorCode = professorCode;
		this.professorName = professorName;
		this.schoolName = schoolName;
		this.schoolSeq = schoolSeq;
		this.eMail = eMail;
		this.majorName = majorName;
		this.majorSeq = majorSeq;
		this.profileImage = profileImage;
		this.approval = approval;
	}
	@Override
	public String toString() {
		return "Professor [professorCode=" + professorCode + ", professorName="
				+ professorName + ", schoolName=" + schoolName + ", schoolSeq="
				+ schoolSeq + ", eMail=" + eMail + ", majorName=" + majorName
				+ ", majorSeq=" + majorSeq + ", profileImage=" + profileImage
				+ ", approval=" + approval + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + approval;
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result
				+ ((majorName == null) ? 0 : majorName.hashCode());
		result = prime * result
				+ ((majorSeq == null) ? 0 : majorSeq.hashCode());
		result = prime * result + professorCode;
		result = prime * result
				+ ((professorName == null) ? 0 : professorName.hashCode());
		result = prime * result
				+ ((profileImage == null) ? 0 : profileImage.hashCode());
		result = prime * result
				+ ((schoolName == null) ? 0 : schoolName.hashCode());
		result = prime * result
				+ ((schoolSeq == null) ? 0 : schoolSeq.hashCode());
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
		Professor other = (Professor) obj;
		if (approval != other.approval)
			return false;
		if (eMail == null) {
			if (other.eMail != null)
				return false;
		} else if (!eMail.equals(other.eMail))
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
		if (profileImage == null) {
			if (other.profileImage != null)
				return false;
		} else if (!profileImage.equals(other.profileImage))
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
		return true;
	}
	
	
}
