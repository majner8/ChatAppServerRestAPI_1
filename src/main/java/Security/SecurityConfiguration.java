package Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import Config.PathConfig;
import Security.JWT.JwtTokenFilter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	public static final String userIsActiveRole="Role_active";

	public static final String jwtTokenPreflix="Bearer ";
	
	public static final String userIsActiveClaimName="Active";
	public static final String userIsNotActiveRole="Role_active";	
	public static final String VersionClaimName="version";
	@Autowired
	public JwtTokenFilter tokenFilter;
	
	 @Override
	 protected void configure(HttpSecurity http)throws Exception {
		 
		 
		 http.csrf().disable()
		 .formLogin().disable()
		 .logout().disable()	
		 .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		 .and() 
		 .addFilterAfter(this.tokenFilter, UsernamePasswordAuthenticationFilter.class)
		 .authorizeRequests()
		 .antMatchers(PathConfig.autorizationPathPreflix+"/**").permitAll()
		 .antMatchers(PathConfig.autorizationPathPreflix+PathConfig.finisRegistrationPath).authenticated()
		 
		 .anyRequest().authenticated();
	 }

	 /*
	 .authorizeRequests()
	 .anyRequest().hasAuthority(UserIdClaimName).authenticated();
	 .antMatchers("/autorization/**").per
	 .anyRequest().authenticated()
	 
	 .and()
	 .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class) 
	 .addFilterBefore(this.emailPass,JwtTokenFilter.class);
	 */
	

}
