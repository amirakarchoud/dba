package com.example.h2demo;

import com.example.h2demo.entities.Adherent;
import com.example.h2demo.repository.AdherentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(AdherentRepository repo){
        return args -> {
            repo.save(new Adherent(null,"A","B",29));
            repo.save(new Adherent(null,"A","B",29));
            repo.save(new Adherent(null,"A","B",29));
            repo.save(new Adherent(null,"A","B",29));
        };
    }


}
