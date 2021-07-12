package me.kodysimpson.javabasedconfiguration.config;

import me.kodysimpson.javabasedconfiguration.services.ColorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorServiceConfig {

    @Bean
    public ColorService colorService(){
        return new ColorService();
    }

}
