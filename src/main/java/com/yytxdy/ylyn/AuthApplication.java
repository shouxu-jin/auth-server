package com.yytxdy.ylyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.yytxdy.ylyn"})
@RestController
public class AuthApplication {

    // http://localhost:8081/oauth/token?username=root&password=123&grant_type=password&scope=any&client_id=client&client_secret=secret
    @RequestMapping("/ping")
    public Object ping() {
        return "pong";
    }

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}
