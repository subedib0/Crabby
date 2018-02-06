package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String crabbyRecipe(){
        return "crabby";
        }

    @RequestMapping("/")
    public String injeraRecipe(){
        return "injera";
    }
    @RequestMapping("/")
    public String golabjamunRecipe(){
        return "golabjamun";
    }
}
