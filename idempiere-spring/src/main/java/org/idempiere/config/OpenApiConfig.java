package org.idempiere.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * OpenAPI/Swagger configuration for the iDempiere REST API.
 */
@Configuration
public class OpenApiConfig {

    @Value("${server.port:8080}")
    private String serverPort;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("iDempiere REST API")
                        .description("REST API for iDempiere ERP system built with Spring Boot and Abacus JDBC")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("iDempiere Team")
                                .url("https://www.idempiere.org")
                                .email("info@idempiere.org"))
                        .license(new License()
                                .name("GPL-2.0")
                                .url("https://www.gnu.org/licenses/old-licenses/gpl-2.0.html")))
                .servers(List.of(
                        new Server()
                                .url("http://localhost:" + serverPort)
                                .description("Local development server")));
    }
}
