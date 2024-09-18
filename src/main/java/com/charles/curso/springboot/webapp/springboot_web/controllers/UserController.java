package com.charles.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

// import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.charles.curso.springboot.webapp.springboot_web.models.User;


@Controller
@RequestMapping("/web")
public class UserController {

    // pasar datos a la vista 

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Carlos" , "Diaz");
        user.setEmail("carlos@gmail.com");
        model.addAttribute("title", "Hi World of Spring Boot!");
        model.addAttribute("user", user);

        return "details";

    }

    // LO MISMO PERO DE UNA MANERA DIFERENTE 

    // @GetMapping("/details")
    // public String details(Map<String, Object> model){

    //     model.put("title", "Hi World of Spring Boot!");
    //     model.put("name", "Carlos");
    //     model.put("lastName", "Díaz");

    //     return "details";

    // }

    @GetMapping("/list")
    public String list(ModelMap model){

        List<User> users = Arrays.asList(
            new User("pepa", "gonzales"),
                                        new User("xd", "sss", "carlos@gmail.com")
                                        );
        
        model.addAttribute("users", users);
        model.addAttribute("title", "Listado Usuariios");
        return "list";

    }

}
