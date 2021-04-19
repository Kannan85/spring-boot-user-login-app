package com.bits.sumanasaha.userloginapp.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure( HttpSecurity httpSecurity ) throws Exception {
        httpSecurity
                .authorizeRequests()
                .antMatchers( "/public/**" ).permitAll()
                .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage( "/signIn.html" )
                    .failureUrl( "/signIn-error.html" )
                    .permitAll();
    }

    @Override
    public void configure( AuthenticationManagerBuilder authBuilder ) throws Exception {
        authBuilder
                .inMemoryAuthentication()
                .withUser( "Student" )
                .password( "{noop}Student@2021" )
                .roles( "USER" );
    }
}
