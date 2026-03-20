package com.capgi.bank.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Capgi Bank Account API",
                version = "1.0",
                description = "This API handles all bank account operations like create, update, transfer",
                contact = @Contact(
                        name = "Capgi Support Team",
                        email = "support@capgi.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://apache.org"
                )
        ),
        servers = {
                @Server(
                        description = "Local Server",
                        url = "http://localhost:6001"
                ),
                @Server(
                        description = "Production Server",
                        url = "https://api.capgi.com"
                )
        }
)
public class OpenApiConfig {
}
