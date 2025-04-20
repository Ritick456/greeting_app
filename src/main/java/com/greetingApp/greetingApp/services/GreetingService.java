package com.greetingApp.greetingApp.services;

import com.greetingApp.greetingApp.Entity.Greeting;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GreetingService {

    public String getGreeting(String firstName  , String lastName);

    Optional<Greeting> findGreetingbyId(Long id);

    List<Greeting> findAllGreeting();

    Greeting updateGreetingMessage(Long id , String newMessage);

}
