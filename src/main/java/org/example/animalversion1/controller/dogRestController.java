package org.example.animalversion1.controller;

import org.example.animalversion1.model.Dog;
import org.example.animalversion1.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class dogRestController {

    @Autowired
    DogRepository dogRepository;

    @GetMapping("/")
    public String hello() {
        return "This is my dog project";
    }

    @GetMapping("/dogs")
    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }


}
