package org.maxwell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutherizationServer {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AutherizationServer.class);
        app.setBannerMode(Mode.OFF);
        app.run(args);
    }

}
