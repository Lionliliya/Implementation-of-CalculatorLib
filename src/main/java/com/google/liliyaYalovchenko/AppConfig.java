package com.google.liliyaYalovchenko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Bootstrap bootstrap(Calculator calculator) {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.setCalculator(calculator);
        return bootstrap;
    }

    @Bean
    public Calculator calculator() {
        Calculator calculator = new Calculator();
        return calculator;
    }


}
