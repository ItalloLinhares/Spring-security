package controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    @RequestMapping(value = "/")
    public String index(){
        System.out.println("XAU!");
        return "index";
    }
    @RequestMapping(value = "/home")
    public String home(){
        System.out.println("XAU!");
        return "home";
    }
}
