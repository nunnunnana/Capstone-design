package Capstone.tancheon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/suji")
    public String suji() {
        return "suji";
    }

    @GetMapping(value = "/giheung")
    public String giheung() {
        return "giheung";
    }

    @GetMapping(value = "/cheoin")
    public String cheoin() {
        return "cheoin";
    }

}

