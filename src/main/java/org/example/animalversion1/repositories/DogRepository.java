package org.example.animalversion1.repositories;

import org.example.animalversion1.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Integer> {

}
