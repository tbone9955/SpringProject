package com.myproject.SpringProject.service;

import org.springframework.stereotype.Service;

@Service
public class RemoteGamerService implements GamerService {
    @Override
    public String getGamerInfo() {
        return "Gamer info retrieved from remote API.";
    }
}