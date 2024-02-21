package org.example.animalversion1.config;

import org.example.animalversion1.model.Dog;
import org.example.animalversion1.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    DogRepository dogRepository;

    @Override
    public void run(String... args) throws Exception {
        Dog myDog = new Dog();
        myDog.setName("Torben");
        myDog.setBreed("Labrador");
        myDog.setBornDate(LocalDate.of(1987, 04, 22));
        dogRepository.save(myDog);
    }
}
