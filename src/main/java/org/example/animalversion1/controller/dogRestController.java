package org.example.animalversion1.controller;

import org.example.animalversion1.model.Dog;
import org.example.animalversion1.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class dogRestController {

    @Autowired
    DogRepository dogRepository;

    //Get hello-message
    @GetMapping("/")
    public String hello() {
        return "This is my dog project";
    }

    //Get all dogs in database
    @GetMapping("/dogs")
    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    @PostMapping("/dog")
    @ResponseStatus(HttpStatus.CREATED)
    public Dog postDog (@RequestBody Dog dog) {
        System.out.println(dog);
        return dogRepository.save(dog);
    }



}
