package root.domain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class MainController {
    @GetMapping("/")
    public String greeting(){
               return "greeting";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }


}
