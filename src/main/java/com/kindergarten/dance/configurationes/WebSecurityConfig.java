package com.kindergarten.dance.configurationes;

import com.kindergarten.dance.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UsersService usersService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(4);
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usersService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests().antMatchers("/", "/css/**", "/kindergarten/**", "/fonts/**", "/js/**", "/header/**",
                "/images/**", "/resources/**", "/blog/**", "/conception/**", "/gallery/**", "/elective/**", "/advertising/**", "/ru/**",
                "/eng/**", "/bower_components/**", "/dist/**", "/plugins/**", "/callBack", "/favicon.ico", "/404",
                "/feature", "/error", "/school/**", "/sport-dance", "/stretching", "/eastern-dance").permitAll()
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/")
                .and().headers()
                .frameOptions().sameOrigin()
                .httpStrictTransportSecurity().disable();
        http.exceptionHandling().accessDeniedPage("/403")
        ;
    }

}