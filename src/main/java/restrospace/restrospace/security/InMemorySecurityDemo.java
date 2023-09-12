package restrospace.restrospace.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class InMemorySecurityDemo {
	
	@Bean
    public UserDetailsService userDetailsService
            (PasswordEncoder passwordEncoder) {
        UserDetails user1 = User.withUsername("Venkatesh")
            .password(passwordEncoder.encode("venkatesh@123"))
            .roles("Role_User")
            .build();

      
        UserDetails user2 = User.withUsername("Sai")
                .password(passwordEncoder.encode("sai@123"))
                .roles("Role_Admin")
                .build();
        return new InMemoryUserDetailsManager(user1,user2);
    }
	 @Bean
	    public PasswordEncoder passwordEncoder() {
	        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	        return encoder;
	    }
}
