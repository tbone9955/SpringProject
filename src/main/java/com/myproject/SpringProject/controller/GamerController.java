package com.myproject.SpringProject.controller;


import com.myproject.SpringProject.service.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GamerController {
    private final GamerService gamerService;

    @Autowired
    public GamerController(@Qualifier("localGamerService") GamerService gamerService) {
        this.gamerService = gamerService;
    }

    @GetMapping("/gamer-info")
    public String getGamerInfo() {
        return gamerService.getGamerInfo();
    }
}