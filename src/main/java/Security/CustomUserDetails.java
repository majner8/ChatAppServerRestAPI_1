package Autorization.Controler;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.auth0.jwt.interfaces.Claim;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Security.JWT.JwtUtils;
import User.Entity.UserDevicesEntity;
import User.Entity.UserEntity;

public class CustomUserDetails implements UserDetails{

	
	private Collection<? extends GrantedAuthority> autority;
	private int userId;

	
	
	
	
	
	
	public CustomUserDetails(Collection<? extends GrantedAuthority> autority, int userId, String phone,
			String emailAdress) {
		this.autority = autority;
		this.userId = userId;

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.autority;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.userId;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public Collection<? extends GrantedAuthority> getAutority() {
		return autority;
	}

	public int getUserId() {
		return userId;
	}


	
	

}