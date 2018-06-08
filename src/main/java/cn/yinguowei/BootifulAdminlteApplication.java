package cn.yinguowei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BootifulAdminlteApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootifulAdminlteApplication.class, args);
    }
}

@RestController
class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot, Hello, AdminLTE!";
    }
}