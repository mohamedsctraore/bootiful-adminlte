package cn.yinguowei;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@Controller
class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello() {
        return "redirect:index2.html";
    }

    @GetMapping(value = {"/**/*.html"})
    public String route(HttpServletRequest request) {
//        logger.debug("DynamicController.route: request.getRequestURI() = {}", request.getRequestURI());
        String path = request.getRequestURI();
//        if (path.startsWith("/")) {
//            System.out.println("path.substring(1, path.length() - 5) = " + path.substring(1, path.length() - 5));
//            return path.substring(1, path.length() - 5); // remove ".html"
        return path;
//        } else {
//            System.out.println("path.substring(0, path.length() - 5) = " + path.substring(0, path.length() - 5));
//            return path.substring(0, path.length() - 5);
//        }
    }
}