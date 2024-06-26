package com.itbank.smartFarm.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public PasswordHashAspect passwordHashAspect() {
        return new PasswordHashAspect();
    }
}

