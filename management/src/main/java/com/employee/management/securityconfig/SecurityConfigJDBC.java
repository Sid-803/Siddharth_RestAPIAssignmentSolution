//package com.employee.management.securityconfig;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfigJDBC extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	DataSource dataSource;
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// PasswordEncoder encoder =
//		// PasswordEncoderFactories.createDelegatingPasswordEncoder();
//		auth.jdbcAuthentication().dataSource(dataSource).withDefaultSchema()
//				.withUser(User.withUsername("Siddharth").password(getPasswordEncoder().encode("Siddharth")).roles("STORE"));
//
//	}
//
//	@Bean
//	PasswordEncoder getPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//}
