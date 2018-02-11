package io.javaa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	 auth.inMemoryAuthentication()
         .withUser("aba").password("aba").roles("USER").and()
         .withUser("admin").password("admin").roles("USER", "ADMIN");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {

      http
        .httpBasic().and()
        .authorizeRequests()
          .antMatchers(HttpMethod.POST,"/players","/fixtures","/results","/table1s","/tickets").hasRole("ADMIN")
          .antMatchers(HttpMethod.PUT, "/players{position}","/fixtures{date}","/results{date}","/table1s{position}","/tickets{club}").hasRole("ADMIN")
          .antMatchers(HttpMethod.DELETE, "/players{position}","fixtures{date}","/results{date}","/table1s{position}","/tickets{club}").hasRole("ADMIN").and()
        .csrf().disable();
    }
}