package com.company.mypage.web.security.jwt.config;

import com.company.mypage.web.security.jwt.filter.JwtAuthenticateFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomUserDetailsService customUserDetailsService;
    private final JwtAuthenticateFilter jwtAuthenticateFilter;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService);
    }
    
    /*
    @Override public void configure(WebSecurity web) throws Exception { 
    	web.ignoring().antMatchers("/h2-console/**"); 
    }
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf()
        	.ignoringAntMatchers("/h2-console/**") // H2 콘솔을 사용하기 위함.
        	.disable()
            .authorizeRequests().antMatchers("/login", "/join", "/h2-console/**").permitAll()
            .anyRequest().authenticated();
        // Stateless (세션사용X)
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // UsernamePasswordAuthenticationFilter 에 도달하기 전에 커스텀한 필터를 먼저 동작시킴
        http.addFilterBefore(jwtAuthenticateFilter, UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
