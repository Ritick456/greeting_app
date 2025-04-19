package com.greetingApp.greetingApp.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String getGreeting(String firstName , String lastName) {

        if (firstName != null && !firstName.isBlank() && lastName != null && !lastName.isBlank()) {
            return "Hello" + firstName + " " + lastName + "!";
        }
        else if (firstName != null && !firstName.isBlank()) {
            return "Hello" + firstName + "!";
        }
        else if (lastName != null && !lastName.isBlank()) {
            return "Hello, Mr./Ms. " + lastName + "!";
        }
        else {
            return "Hello World!";
        }

    }

}


