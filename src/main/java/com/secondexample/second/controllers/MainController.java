package com.secondexample.second.controllers;


import com.secondexample.second.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController                         //it takes care of mapping request data to the defined request handler method
@RequestMapping("/api")             //it contains the url endpoints
public class MainController {
@Autowired
   public  LoginService loginSvc;

    public MainController(LoginService loginSvc) {
        this.loginSvc = loginSvc;
    }

    @GetMapping("/login")
        public String login(@RequestParam(value = "username") String uname, @RequestParam(value = "password") String password){
            String response=loginSvc.login(uname, password);
            return response;
        }

    @GetMapping("/hello")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Have a nice day!");
    }
    }





