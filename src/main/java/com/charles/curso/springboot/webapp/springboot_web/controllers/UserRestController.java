package com.charles.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

// import java.util.HashMap;
// import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charles.curso.springboot.webapp.springboot_web.models.User;
import com.charles.curso.springboot.webapp.springboot_web.models.dto.UserDto;

// VAMOS A CONVERTIRLO EN UNA APIREST
@RestController
@RequestMapping("/api")
public class UserRestController {

    // @GetMapping("/details")
    // public Map<String, Object> details(){

    //     User user = new User("Carlos" , "Diaz");

    //     Map<String, Object> body = new HashMap<>();

    //     body.put("title", "Hi World of Spring Boot!");
    //     body.put("user", user);

    //     return body;

    // }

    @GetMapping("/details")
    public UserDto details(){

        User user = new User("Carlos" , "Diaz");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hi World of SpringBoot!");

        return userDto;

    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Carlos", "Diaz");
        User user2 = new User("Silvia", "Angatita");

        List<User> users = Arrays.asList(user, user2);

        return users;
    }

}
