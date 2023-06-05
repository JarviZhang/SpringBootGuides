package com.example.projectcode2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ProjectCode2Application {
    private static final Logger log = LoggerFactory.getLogger(ProjectCode2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(ProjectCode2Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "http://localhost:8080/api/random",Quote.class
            );
            log.info(quote.toString());
        };
    }

}
