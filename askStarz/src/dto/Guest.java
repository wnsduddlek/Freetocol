package dto;

import java.io.Serializable;

public class Guest implements Serializable {
	private int guestCode;
	private String guestIp;
	private String guestPassword;
	private String guestName;
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Guest(int guestCode, String guestIp, String guestPassword,
			String guestName) {
		super();
		this.guestCode = guestCode;
		this.guestIp = guestIp;
		this.guestPassword = guestPassword;
		this.guestName = guestName;
	}
	@Override
	public String toString() {
		return "Guest [guestCode=" + guestCode + ", guestIp=" + guestIp
				+ ", guestPassword=" + guestPassword + ", guestName="
				+ guestName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + guestCode;
		result = prime * result + ((guestIp == null) ? 0 : guestIp.hashCode());
		result = prime * result
				+ ((guestName == null) ? 0 : guestName.hashCode());
		result = prime * result
				+ ((guestPassword == null) ? 0 : guestPassword.hashCode());
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
		Guest other = (Guest) obj;
		if (guestCode != other.guestCode)
			return false;
		if (guestIp == null) {
			if (other.guestIp != null)
				return false;
		} else if (!guestIp.equals(other.guestIp))
			return false;
		if (guestName == null) {
			if (other.guestName != null)
				return false;
		} else if (!guestName.equals(other.guestName))
			return false;
		if (guestPassword == null) {
			if (other.guestPassword != null)
				return false;
		} else if (!guestPassword.equals(other.guestPassword))
			return false;
		return true;
	}
	public int getGuestCode() {
		return guestCode;
	}
	public void setGuestCode(int guestCode) {
		this.guestCode = guestCode;
	}
	public String getGuestIp() {
		return guestIp;
	}
	public void setGuestIp(String guestIp) {
		this.guestIp = guestIp;
	}
	public String getGuestPassword() {
		return guestPassword;
	}
	public void setGuestPassword(String guestPassword) {
		this.guestPassword = guestPassword;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	
	
}
