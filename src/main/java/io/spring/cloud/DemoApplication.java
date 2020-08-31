package io.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class DemoApplication {

    @Bean
    public Function<String, String> uppercase() {
        return String::toUpperCase;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
