package jiao.springbootfun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootFunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFunApplication.class, args);
    }

}
