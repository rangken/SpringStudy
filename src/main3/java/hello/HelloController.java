package hello;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @ResponseStatus(value= HttpStatus.OK, reason="잘못된 접근입니다.")
    public class UrlNotFoundException extends RuntimeException { }


    @RequestMapping("/")
    public String index(@RequestParam(value="content", defaultValue="jaeyoung") String content) {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
        System.out.println("admin");
        return "";
    }

}