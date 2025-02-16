package com.candido.animal.repositories;

import com.candido.animal.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    @Query("SELECT a FROM Animal a WHERE a.nomeRecebedor = :nomeRecebedor")
    List<Animal> findByRecebedor(@Param("nomeRecebedor") String nomeRecebedor);
}
