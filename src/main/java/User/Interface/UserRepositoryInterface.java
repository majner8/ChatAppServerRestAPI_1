package User.Interface;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import User.Entity.UserEntity;



/**Metod provided database manipulation metod
 * Have to be ensured that value will not null */

public interface UserRepositoryInterface extends JpaRepository<UserEntity,Integer> {

	
	Optional<UserEntity> findByEmail(String email);

	Optional<UserEntity> findByPhoneAndCountry_preflix(String phone,String country_Preflix);

	boolean existsByEmail(String email);
	boolean existsByPhoneAndCountry_preflix(String phone,String countryPreflix);
	
	default boolean existsByEmailOrPhoneAndCountryPreflix(String email, String phone, String countryPreflix) {
		if(email!=null) {
			return existsByEmail(email);
		}
		 return this.existsByPhoneAndCountry_preflix(phone, countryPreflix);
	}
	 
	
}
