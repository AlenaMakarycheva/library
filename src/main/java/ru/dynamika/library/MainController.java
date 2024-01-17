package ru.dynamika.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getChoose(){
        return "main.html";
    }

    @GetMapping("/error")
    public String getError(){
        return "error.html";
    }

}
