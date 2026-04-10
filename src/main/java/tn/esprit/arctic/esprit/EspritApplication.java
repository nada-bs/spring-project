package tn.esprit.arctic.esprit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class EspritApplication {

    public static void main(String[] args) {
        SpringApplication.run(EspritApplication.class, args);
    }

}
