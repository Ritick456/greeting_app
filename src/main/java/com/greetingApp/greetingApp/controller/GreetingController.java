package com.greetingApp.greetingApp.controller;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public Map<String , String> getGreeting(){

        Map<String , String> response = new HashMap<>();
        response.put("method" , "get");
        response.put("message" , "Hello from get method");
        return response;

    }

    @PostMapping
    public Map<String , String> postGreeting(){

        Map<String , String> response = new HashMap<>();
        response.put("method" , "get");
        response.put("message" , "Hello from get method");
        return response;

    }

    @PutMapping
    public Map<String , String> putGreeting(){

        Map<String , String> response = new HashMap<>();
        response.put("method" , "get");
        response.put("message" , "Hello from get method");
        return response;

    }

    @DeleteMapping
    public Map<String , String> deleteGreeting(){

        Map<String , String> response = new HashMap<>();
        response.put("method" , "get");
        response.put("message" , "Hello from get method");
        return response;

    }



}
