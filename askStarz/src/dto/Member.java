package dto;

import java.io.Serializable;

public class Member implements Serializable {
	private String eMail;
	private String schoolName;
	private String schoolSeq;
	private String password;
	private String nickName;
	private String majorName;
	private String majorSeq;
	private int memberCode;
	private int studentNumber;
	private int point;
	private int personaconCode;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
	public int getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPersonaconCode() {
		return personaconCode;
	}
	public void setPersonaconCode(int personaconCode) {
		this.personaconCode = personaconCode;
	}
	@Override
	public String toString() {
		return "member [eMail=" + eMail + ", schoolName=" + schoolName
				+ ", schoolSeq=" + schoolSeq + ", password=" + password
				+ ", nickName=" + nickName + ", majorName=" + majorName
				+ ", majorSeq=" + majorSeq + ", memberCode=" + memberCode
				+ ", studentNumber=" + studentNumber + ", point=" + point
				+ ", personaconCode=" + personaconCode + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result
				+ ((majorName == null) ? 0 : majorName.hashCode());
		result = prime * result
				+ ((majorSeq == null) ? 0 : majorSeq.hashCode());
		result = prime * result + memberCode;
		result = prime * result
				+ ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + personaconCode;
		result = prime * result + point;
		result = prime * result
				+ ((schoolName == null) ? 0 : schoolName.hashCode());
		result = prime * result
				+ ((schoolSeq == null) ? 0 : schoolSeq.hashCode());
		result = prime * result + studentNumber;
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
		Member other = (Member) obj;
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
		if (memberCode != other.memberCode)
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (personaconCode != other.personaconCode)
			return false;
		if (point != other.point)
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
		if (studentNumber != other.studentNumber)
			return false;
		return true;
	}
	public Member(String eMail, String schoolName, String schoolSeq,
			String password, String nickName, String majorName,
			String majorSeq, int memberCode, int studentNumber, int point,
			int personaconCode) {
		super();
		this.eMail = eMail;
		this.schoolName = schoolName;
		this.schoolSeq = schoolSeq;
		this.password = password;
		this.nickName = nickName;
		this.majorName = majorName;
		this.majorSeq = majorSeq;
		this.memberCode = memberCode;
		this.studentNumber = studentNumber;
		this.point = point;
		this.personaconCode = personaconCode;
	}
	public Member(String eMail, String password, String nickName, int memberCode) {
		super();
		this.eMail = eMail;
		this.password = password;
		this.nickName = nickName;
		this.memberCode = memberCode;
	}
	public Member(String schoolName, int point) {
		super();
		this.schoolName = schoolName;
		this.point = point;
	}
	public Member(String eMail, String password) {
		super();
		this.eMail = eMail;
		this.password = password;
	}
	
	
	
	
}
