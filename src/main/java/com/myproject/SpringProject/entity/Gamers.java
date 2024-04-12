package com.myproject.SpringProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Gamers {
    @Id
    @GeneratedValue
    private Long id;
    private String gamerTag;
    private String gamerEmail;

    //constructor
    public Gamers(String gamerTag, String gamerEmail) {
        this.gamerTag = gamerTag;
        this.gamerEmail = gamerEmail;
    }

    public Gamers() {

    }

    @Override
    public String toString() {
        return "Gamers{" +
                "id=" + id +
                ", gamerTag='" + gamerTag + '\'' +
                ", gamerEmail='" + gamerEmail + '\'' +
                '}';
    }

    public String getGamerTag() {
        return gamerTag;
    }

    public void setGamerTag(String gameTag) {
        this.gamerTag = gamerTag;
    }

    public String getGamerEmail() {
        return gamerEmail;
    }

    public void setGamerEmail(String gamerEmail) {
        this.gamerEmail = gamerEmail;
    }



    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }


}
