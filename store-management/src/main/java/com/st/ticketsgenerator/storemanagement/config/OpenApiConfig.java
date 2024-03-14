package com.st.ticketsgenerator.storemanagement.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI storesOpenAPI() {
        return new OpenAPI().info(
                new Info()
                        .title("Store Management API")
                        .description("Describes how Store Management API can be used")
                        .version("1.0"));
    }
}
