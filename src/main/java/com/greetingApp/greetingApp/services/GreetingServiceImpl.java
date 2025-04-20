package com.greetingApp.greetingApp.services;

import com.greetingApp.greetingApp.Entity.Greeting;
import com.greetingApp.greetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public String getGreeting(String firstName, String lastName) {

        String message;

        if (firstName != null && !firstName.isBlank() && lastName != null && !lastName.isBlank()) {
            message = "Hello " + firstName + " " + lastName + "!";
        } else if (firstName != null && !firstName.isBlank()) {
            message = "Hello " + firstName + "!";
        } else if (lastName != null && !lastName.isBlank()) {
            message = "Hello, Mr./Ms. " + lastName + "!";
        } else {
            message = "Hello World!";
        }

        // Save the message to the database
        greetingRepository.save(new Greeting(message));

        return message;
    }

    public Optional<Greeting> findGreetingbyId(Long id){
        return greetingRepository.findById(id);
    }

    public List<Greeting> findAllGreeting(){
        return greetingRepository.findAll();
    }

    public Greeting updateGreetingMessage(Long id, String newMessage) {
        // Step 1: Find the existing greeting
        Greeting greeting = greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found with id: " + id));

       greeting.setMessage(newMessage);

       return greetingRepository.save(greeting);
    }


}
