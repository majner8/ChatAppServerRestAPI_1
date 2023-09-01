package Autorization.JwtToken;

import Autorization.DTO.TokenDTO;
import User.Entity.UserEntity;

public interface JwtTokenInterface {

	/**Metod generate and return UnActive token,
	 * token can be used only to finish registration
	 * @param UserEntity if value isUserActive =false
	 *Metod return UnActive Token, can be used just to finish registration */
	public TokenDTO generateToken(UserEntity user);
	
	/**Metod generate and return token */
	public TokenDTO generateToken(int userId);
	
}
