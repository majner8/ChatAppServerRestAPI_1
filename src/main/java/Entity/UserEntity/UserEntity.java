package Entity.UserEntity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="user")
public class UserEntity {

	@Column(name="email")
	private String email;
	@Column(name="country_preflix")
	private String countryPreflix;
	@Column(name="phone")
	private String phone;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="useruuid")
	private int userId;
	@Column(name="Sername")
	private String serName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="birthday")
	private Date birthDay;
	
	@Column(name="is_user_active")
	private boolean isUserActive;
	
	@Version
	private long version;

	
	public long getVersion() {
		return version;
	}
	public void setVersion(long version) {
		this.version = version;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountryPreflix() {
		return countryPreflix;
	}
	public void setCountry_preflix(String country_preflix) {
		this.countryPreflix = country_preflix;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
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
	public boolean isUserActive() {
		return isUserActive;
	}
	public void setUserActive(boolean isUserActive) {
		this.isUserActive = isUserActive;
	}
	
	

	
}
