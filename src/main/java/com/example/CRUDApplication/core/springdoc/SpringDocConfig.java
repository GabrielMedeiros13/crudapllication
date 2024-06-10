package com.example.CRUDApplication.core.springdoc;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info()
                .title("Book API")
                .version("v1")
                .description("REST API para operações simples com livros")
        ).externalDocs(new ExternalDocumentation()
                .description("Link Test")
                .url("http://test.com")
        );
    }
}
