package com.myproject.SpringProject.component;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

// Simple component example where we log a message to the console.
// also leveraging SpEL expression below
@Component
public class LoggerComponent {

    @Value("#{systemProperties['user.name']}") // SpEL expression to get the system user's name
    private String userName;


    public void log(String message) {
        System.out.println("[" + userName + "] Logging: " + message);
    }
}