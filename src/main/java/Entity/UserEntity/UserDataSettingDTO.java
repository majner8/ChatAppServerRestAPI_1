package Entity.UserEntity;

import java.util.Date;

import javax.persistence.Column;

public class UserDataSettingDTO {

	private String serName;
	private String lastName;
	private Date birthDay;
	public String getSerName() {
		return serName;
	}
	public void setSerName(String serName) {
		this.serName = serName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	
	
}
