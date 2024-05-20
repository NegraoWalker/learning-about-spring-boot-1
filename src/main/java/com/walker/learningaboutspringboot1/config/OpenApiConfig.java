package com.walker.learningaboutspringboot1.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig { //CLASSE CRIADA PARA DEFINIR AS CONFIGURAÇÕES DO OPEN API SWAGGER
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("Learning About Spring Boot 1").version("v1").description("API designed to learn about Spring Boot").termsOfService("walker.org").license(new License().name("Apache 2.0").url("org.walker.learning")));
    }
}
