package com.myproject.SpringProject.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.myproject.SpringProject.repository.GamersRepository;
import com.myproject.SpringProject.component.LoggerComponent;  // simple component that simply logs to console

// This sample retrieves data from the H2 in-memory database
@Service
public class LocalGamerService implements GamerService {
    private final GamersRepository gamersRepository;
    private final LoggerComponent loggerComponent;

        //GamerRepository is injected into LocalGamerService using constructor injection
    @Autowired
    public LocalGamerService(GamersRepository gamersRepository, LoggerComponent loggerComponent) {
        this.loggerComponent = loggerComponent;
        this.gamersRepository = gamersRepository;
    }

    @Override
    public String getGamerInfo() {
        // Log what you are about to do to the console
        loggerComponent.log("Getting gamer info from local H2 in-memory database.");

        // Returns a list of Gamers - converted to string
        return gamersRepository.findAll().toString();
    }
}
