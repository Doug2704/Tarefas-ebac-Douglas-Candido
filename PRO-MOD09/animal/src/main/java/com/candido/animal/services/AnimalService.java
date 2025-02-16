package com.candido.animal.services;

import com.candido.animal.entities.Animal;
import com.candido.animal.entities.RecebedorDTO;
import com.candido.animal.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Animal create(Animal animal) {
        return animalRepository.save(animal);
    }

    /**
     * @param recebedorDTO (contendo nome do recebedor, data inicial e data final)
     * @return uma lista de animais que foram recebidos em um determinado intervalo de tempo
     * por um recebedor específico
     */
    public List<Animal> AnimaisPorRecebedorETempo(RecebedorDTO recebedorDTO) {
        List<Animal> animaisPorRecebedor = animalRepository.findByRecebedor(recebedorDTO.nomeRecebedor());
        List<Animal> animaisPorTempo = new ArrayList<>();

        for (Animal animal : animaisPorRecebedor) {
            if (animal.getDataEntrada().compareTo(recebedorDTO.dataInicial()) >= 0 && animal.getDataEntrada().compareTo(recebedorDTO.dataFinal()) <= 0) {
                animaisPorTempo.add(animal);
            }
        }
        return animaisPorTempo;
    }

}
