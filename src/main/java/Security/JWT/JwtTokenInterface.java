package Security.JWT;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.auth0.jwt.interfaces.DecodedJWT;

import Autorization.DTO.TokenDTO;
import User.Entity.UserEntity;

public interface JwtTokenInterface {

	/**Metod generate and return UnActive token,
	 * token can be used only to finish registration
	 * @param UserEntity if value isUserActive =false
	 *Metod return UnActive Token, can be used just to finish registration */
	public TokenDTO generateToken(UserEntity user,String deviceID);
	
	/**Metod generate and return token */
	public TokenDTO generateToken(int userId,String deviceID);

	public DecodedJWT tokenValidation(HttpServletRequest request);

	
}
