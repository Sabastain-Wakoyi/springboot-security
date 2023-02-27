package com.snva.securityboot.Config;

import org.springframework.http.HttpMethod;
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
}
