package com.hl.demo.Hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "usrname") String name, Model model) {
        model.addAttribute("usrname", name);
        return "Hello";
    }
}
