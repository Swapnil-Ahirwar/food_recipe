package com.foodRecipes.controller;

import com.foodRecipes.entity.User;
import com.foodRecipes.repository.UserRepository;
import com.foodRecipes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@ComponentScan
//@RequestMapping("/api")
public class AppController {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private UserService userService;
//
//    @GetMapping("users")
//    public ResponseEntity<List<User>> getAllUsers(){
//        List<User> users = userService.getAllUser();
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }

    @GetMapping("/register")
    public String showSignUpForm(Model model){
        model.addAttribute("user", new User());
        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegistration(User user){
        userRepository.save(user);
        return "register_success";
    }
}
