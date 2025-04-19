package com.greetingApp.greetingApp.controller;


import com.greetingApp.greetingApp.Entity.Greeting;
import com.greetingApp.greetingApp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private  GreetingService greetingService ;

    @GetMapping
    public Map<String , String> getGreeting( @RequestParam(required = false) String firstName , @RequestParam(required = false) String lastName){
        
        Map<String , String> response = new HashMap<>();
        response.put("method" , "get");
        response.put("message" , greetingService.getGreeting(firstName , lastName));
        return response;

    }

    @GetMapping("/message/{id}")
    public ResponseEntity<?> getGreetingById(@PathVariable Long id){
        Optional<Greeting> greeting = greetingService.findGreetingbyId(id);

        if (greeting.isPresent()) {
            return ResponseEntity.ok(greeting.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Greeting not found with ID: " + id);
        }
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
