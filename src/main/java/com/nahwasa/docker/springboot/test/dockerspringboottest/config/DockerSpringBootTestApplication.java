package com.nahwasa.docker.springboot.test.dockerspringboottest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nahwasa.docker.springboot.test.dockerspringboottest")
public class DockerSpringBootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringBootTestApplication.class, args);
    }

}
