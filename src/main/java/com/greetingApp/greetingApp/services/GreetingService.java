package com.greetingApp.greetingApp.services;

import org.springframework.stereotype.Service;

@Service
public interface GreetingService {

    public String getGreeting(String firstName  , String lastName);

}
