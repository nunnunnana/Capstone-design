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

    @GetMapping(value = "/dong_s")
    public String dong_s() {
        return "dong_s";
    }

    @GetMapping(value = "/dong_g")
    public String dong_g() {
        return "dong_g";
    }

    @GetMapping(value = "/dong_c")
    public String dong_c() {
        return "dong_c";
    }

    @GetMapping(value = "/recommend")
    public String recommend() {
        return "recommend";
    }

    @GetMapping(value = "/findway")
    public String findway() {
        return "findway";
    }

    @GetMapping(value = "/springhome")
    public String springhome() {
        return "springhome";
    }

}

