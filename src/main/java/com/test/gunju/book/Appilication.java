package com.test.gunju.book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class Appilication {
    public static void main(String[] args){
        SpringApplication.run(Appilication.class, args);
    }
}
