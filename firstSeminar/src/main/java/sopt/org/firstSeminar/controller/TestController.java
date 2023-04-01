package sopt.org.firstSeminar.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //통신 컨트롤러 느낌인 것 같다.
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "welcome Spring";
    }
}
