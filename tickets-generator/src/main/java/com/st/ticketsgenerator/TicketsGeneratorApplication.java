package com.st.ticketsgenerator;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
@OpenAPIDefinition(info = @Info(title = "Tickets Generator API", version = "1.0", description = "Tickets generation to clients"))
public class TicketsGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketsGeneratorApplication.class, args);
	}

}
