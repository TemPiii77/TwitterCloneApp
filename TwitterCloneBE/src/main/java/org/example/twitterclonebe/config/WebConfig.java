package org.example.twitterclonebe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests (auth ->
                auth.
                        requestMatchers(AntPathRequestMatcher.antMatcher("/")).hasAnyRole("STUDENT","TEACHER","ADMIN")
                        .anyRequest().authenticated()

        );
        http.logout(lOut -> {
            lOut.invalidateHttpSession(true)
                    .clearAuthentication(true)
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .logoutSuccessUrl("/login")
                    .permitAll();
        });
        http.formLogin(lIn -> {
            lIn.loginProcessingUrl("/login")
                    .defaultSuccessUrl("/", true)
                    .permitAll();
        });

        HttpSessionRequestCache requestCache = new HttpSessionRequestCache();
        requestCache.setMatchingRequestParameterName(null);
        http
                // ...
                .requestCache((cache) -> cache
                        .requestCache(requestCache)
                );

        return http.build();

    }

    @Bean
    public UserDetailsService userDetailsManager() {

        UserDetails susan = User.builder()
                .username("a")
                .password("{noop}a")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(susan);
    }
}
