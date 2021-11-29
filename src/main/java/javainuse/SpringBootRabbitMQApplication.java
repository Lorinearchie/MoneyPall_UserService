package javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootRabbitMQApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(SpringBootRabbitMQApplication.class, args);
    }
}