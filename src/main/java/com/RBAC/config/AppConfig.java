package com.RBAC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    // user name nd password for admin 
    public UserDetailsService userDetailsService(){
        UserDetails admin =  User.builder().username("Hemant").password(passwordEncoder().encode("Hemant@1234")).roles("ADMIN").build();
        UserDetails moderator =  User.builder().username("Sushant").password(passwordEncoder().encode("Sushant@1234")).roles("MODERATOR").build();
        UserDetails user =  User.builder().username("Deepak").password(passwordEncoder().encode("Deepak@1234")).roles("USER").build();
        return new InMemoryUserDetailsManager(admin,moderator,user);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
        
    }

     @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }    
}
