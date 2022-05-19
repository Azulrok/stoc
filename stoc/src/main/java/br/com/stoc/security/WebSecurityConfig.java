package br.com.stoc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;




@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private UserDetailServiceImpl userDetailServiceImpl;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.
		   authorizeRequests()
		        .antMatchers("/webjars/**").permitAll()
		        .antMatchers("/images/**").permitAll()
		        .antMatchers("/login").permitAll()
		        .antMatchers("/funcionario").hasAnyRole("FUNCIONARIO")
		        .antMatchers("/recuperar_senha").permitAll()
		        .anyRequest()
		        .authenticated()
		        .and()
		        .formLogin()
		        .loginPage("/login")
		        .usernameParameter("username")
		        .passwordParameter("password")
		        .successForwardUrl("/postlogin")
		        .permitAll()
		        .and()
		        .logout()
		        .logoutSuccessUrl("/login?logout")
		        .permitAll()
		        .and()
		        .rememberMe();
	}
		@Autowired
		public void configureGlobal(AuthenticationManagerBuilder auth)
		 throws Exception{
				 BCryptPasswordEncoder b = new BCryptPasswordEncoder();
				 System.out.println(b.encode("123456"));
				auth.userDetailsService(userDetailServiceImpl).passwordEncoder(new BCryptPasswordEncoder());
	
		}
	}
	