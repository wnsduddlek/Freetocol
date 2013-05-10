package dto;

import java.io.Serializable;

public class Personacon implements Serializable {
	private int personaconCode;
	private int price;
	private String fileName;
	public int getPersonaconCode() {
		return personaconCode;
	}
	public void setPersonaconCode(int personaconCode) {
		this.personaconCode = personaconCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Personacon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personacon(int personaconCode, int price, String fileName) {
		super();
		this.personaconCode = personaconCode;
		this.price = price;
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "Personacon [personaconCode=" + personaconCode + ", price="
				+ price + ", fileName=" + fileName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + personaconCode;
		result = prime * result + price;
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
		Personacon other = (Personacon) obj;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (personaconCode != other.personaconCode)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
}
