package com.secondexample.second.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController                         //it takes care of mapping request data to the defined request handler method
@RequestMapping("/api/exampleapp")             //it contains the url endpoints
public class MainController {

    @GetMapping("/springfirst")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Have a nice day!");
    }

}
