package web.messanger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessangerController {
    @GetMapping("hello")
    public String Hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello!";
    }
}
