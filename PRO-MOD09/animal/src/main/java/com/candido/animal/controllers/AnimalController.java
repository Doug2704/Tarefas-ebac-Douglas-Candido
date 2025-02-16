package com.candido.animal.controllers;

import com.candido.animal.entities.Animal;
import com.candido.animal.entities.RecebedorDTO;
import com.candido.animal.services.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/animais")

public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createAnimal(@RequestBody Animal animal) {

        try {
            if (animal.getDataEntrada() == null) {
                animal.setDataEntrada(LocalDate.now());
            }
            Animal createdAnimal = animalService.create(animal);
            return new ResponseEntity<>(createdAnimal, HttpStatus.OK);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @GetMapping
    public ResponseEntity<List<Animal>> findAll() {
        List<Animal> animals = animalService.findAll();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/por-recebedor")
    public ResponseEntity<List<Animal>> QtdAnimaisPorRecebedor(@RequestBody RecebedorDTO recebedorDTO) {
        List<Animal> animals = animalService.AnimaisPorRecebedorETempo(recebedorDTO);
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }
}
