package com.snva.securityboot.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class SecurityConfig {

    protected void configure(HttpSecurity http) throws  Exception{
        http


                .formLogin()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/admin").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/premium").hasRole("PREMIUM")
                .antMatchers(HttpMethod.GET,"/user").hasRole("USER")
                .and()
                .csrf().disable();

    }


    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("{noop}").roles("ADMIN")
                .and()
                .withUser("premium").password("{noop}").roles("PREMIUM")
                .and()
                .withUser("user").password("{noop}").roles("USER")

    }


}
