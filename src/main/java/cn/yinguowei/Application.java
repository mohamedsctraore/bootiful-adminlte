package cn.yinguowei;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@Controller
class AdminController {
    private static Logger logger = LoggerFactory.getLogger(AdminController.class);

//    @GetMapping(value = {"/", ""})
//    @PostMapping(value = {"/", ""})
    @RequestMapping("/")
    public String home() {
        return "redirect:index2.html";
    }

    @GetMapping("/**/*.html")
    public String route(HttpServletRequest request) {
        logger.debug("AdminController.route: request.getRequestURI() = {}", request.getRequestURI());
        String path = request.getRequestURI();
        return path;
    }
}