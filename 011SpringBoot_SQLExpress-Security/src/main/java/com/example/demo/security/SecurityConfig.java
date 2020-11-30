package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// authentication - authenticate incoming request for valid username 
		// and password!
		auth.inMemoryAuthentication()
			.withUser("visitor").password("{noop}visitor123").roles("VISITOR")
			.and()
			.withUser("manager").password("{noop}manager123").roles("VISITOR", "MANAGER")
			.and()
			.withUser("admin").password("{noop}admin123").roles("VISITOR", "MANAGER", "ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// authorization - map authenticated users to roles. map roles to resources.
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/welcome").permitAll()
			.antMatchers("/friends/get/**").hasAnyRole("VISITOR", "MANAGER", "ADMIN")
			.antMatchers("/friends/update/**").hasAnyRole("MANAGER", "ADMIN")
			.antMatchers("/friends/add").hasAnyRole("ADMIN")
			.and()
			.httpBasic()
			.and()
			.csrf().disable();
	}
	
	

}
