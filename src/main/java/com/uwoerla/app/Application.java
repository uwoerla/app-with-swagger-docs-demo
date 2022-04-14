package com.uwoerla.app;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author : uwoerla
 * @date : 2022/4/14
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public OpenAPI openAPI(@Value("${springdoc.title}") String title, @Value("${springdoc.version}") String appVersion,
                           @Value("${springdoc.description}") String description) {
        return new OpenAPI().info(new Info()
                .title(title)
                .version(appVersion)
                .description(description)
        );
    }
}