package com.myproject.SpringProject.repository;

import com.myproject.SpringProject.entity.Gamers;
import org.springframework.data.repository.CrudRepository;

public interface GamersRepository extends CrudRepository<Gamers, Long> {
    // Don't need to implement anything because its built into JPA

}
