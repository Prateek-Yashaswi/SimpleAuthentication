package com.auth.SimpleAuthentication.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocsConfig {
    private static final Contact CONTACT = new Contact()
            .email("prateekyashaswi34@gmail.com")
            .name("Prateek Yashaswi");
    private static final Info INFO = new Info().contact(CONTACT)
            .version("1.0").title("Simple Authentication")
            .description("Simple Authentication API that provides functionalities like User Registration, Login And Change Password");

    @Bean
    public OpenAPI configureSwagger(){
        return new OpenAPI().info(INFO);
    }
}
